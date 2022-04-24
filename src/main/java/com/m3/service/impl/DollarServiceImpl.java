package com.m3.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m3.domain.Dollars;
import com.m3.model.Bpi;
import com.m3.model.DollarReq;
import com.m3.model.DollarRes;
import com.m3.model.ExchangeRateRes;
import com.m3.repository.DollarsRepository;
import com.m3.service.DollarsService;
import com.m3.utils.CalendarUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DollarServiceImpl implements DollarsService {

	@Autowired
	private DollarsRepository dollarsRepository;

	@Override
	public List<Dollars> findAll() {
		// TODO Auto-generated method stub
		return dollarsRepository.findAll();
	}

	@Transactional
	public Dollars save(Dollars dollars) {
		// TODO Auto-generated method stub
		return dollarsRepository.save(dollars);
	}

	@Override
	public Optional<Dollars> findById(Long id) {
		// TODO Auto-generated method stub
		return dollarsRepository.findById(id.intValue());
	}

	@Transactional
	public void delete(Dollars dollar) {
		// TODO Auto-generated method stub
		dollarsRepository.delete(dollar);
		;
	}

	@Override
	public ExchangeRateRes exchangeDollars(DollarReq req) {
		// TODO Auto-generated method stub
		if (req == null) {
			return null;
		}

		ExchangeRateRes res = new ExchangeRateRes();
		List<DollarRes> resDollars = new ArrayList<DollarRes>();
		List<Dollars> all_Dollars = this.findAll();
		List<Bpi> request = req.getBpi();
		for (Bpi chk : request) {
			String code = chk.getCode();
			for (Dollars dollar : all_Dollars) {
				if (code.equals(dollar.getDollar_kind())) {
					DollarRes tmp = new DollarRes();
					tmp.setCode(code);
					tmp.setDollar_name(dollar.getDollar_name());
					tmp.setRate(chk.getRate());
					resDollars.add(tmp);
				}
			}
			res.setDollarDetail(resDollars);
		}
		res.setUpdate_dt(CalendarUtils.LocalDateTimeToString(req.getTime().getUpdatedISO()));
		return res;
	}

}
