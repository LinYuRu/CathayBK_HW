package com.m3.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m3.model.DollarEntity;
import com.m3.model.DollarReq;
import com.m3.model.DollarSaveReq;
import com.m3.model.DollarsSaveRes;
import com.m3.model.ExchangeRateRes;

public interface DollarsApi {

	@RequestMapping(value = "/dollars", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<DollarEntity>> findAllDollars();

	@RequestMapping(value = "/saveDollars", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<DollarsSaveRes> saveDollars(@RequestBody DollarSaveReq body);

	@RequestMapping(value = "/deleteDollars", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<DollarsSaveRes> deleteDollars(@RequestBody DollarSaveReq body);

	@RequestMapping(value = "/exchangeDollars", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<ExchangeRateRes> exchangeDollars(@RequestBody DollarReq body);

}
