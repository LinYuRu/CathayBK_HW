package com.m3.service;

import java.util.List;
import java.util.Optional;

import com.m3.domain.Dollars;
import com.m3.model.DollarReq;
import com.m3.model.ExchangeRateRes;

public interface DollarsService {
	List<Dollars> findAll();

	Dollars save(Dollars dollars);

	Optional<Dollars> findById(Long id);

	void delete(Dollars dollar);
	
	ExchangeRateRes exchangeDollars(DollarReq req);
}
