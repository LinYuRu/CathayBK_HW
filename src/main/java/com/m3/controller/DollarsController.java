package com.m3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.m3.api.DollarsApi;
import com.m3.domain.Dollars;
import com.m3.model.DollarEntity;
import com.m3.model.DollarReq;
import com.m3.model.DollarSaveReq;
import com.m3.model.DollarsSaveRes;
import com.m3.model.ExchangeRateRes;
import com.m3.service.DollarsService;

@RestController
public class DollarsController implements DollarsApi {
	@Autowired
	private DollarsService dollarsService;

	@Override
	public ResponseEntity<List<DollarEntity>> findAllDollars() {
		List<Dollars> dollars = dollarsService.findAll();
		List<DollarEntity> response = new ArrayList<DollarEntity>();
		if(dollars!=null) {
			BeanUtils.copyProperties(dollars, response);			
		}
		return new ResponseEntity<List<DollarEntity>>(response, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<DollarsSaveRes> saveDollars(DollarSaveReq body) {
		Dollars target = new Dollars();
		BeanUtils.copyProperties(body, target);
		Dollars result = dollarsService.save(target);
		DollarsSaveRes res = new DollarsSaveRes();
		if(result!=null) {
			res.setStatus("202");
			res.setMessage("OK");
		}else {
			res.setStatus("400");
			res.setMessage("fail");
		}
		return new ResponseEntity<DollarsSaveRes>(res, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<DollarsSaveRes> deleteDollars(DollarSaveReq body) {
		Dollars target = new Dollars();
		BeanUtils.copyProperties(body, target);
		dollarsService.delete(target);
		DollarsSaveRes res = new DollarsSaveRes("202","OK");
		return new ResponseEntity<DollarsSaveRes>(res, HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<ExchangeRateRes> exchangeDollars(DollarReq req) {
		ExchangeRateRes res = dollarsService.exchangeDollars(req);
		return new ResponseEntity<ExchangeRateRes>(res, HttpStatus.OK);
	}

}
