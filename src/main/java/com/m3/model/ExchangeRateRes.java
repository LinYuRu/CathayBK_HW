package com.m3.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRateRes {
	@JsonProperty("update_dt")
	private String update_dt;
	@JsonProperty("dollarDetail")
	private List<DollarRes> dollarDetail;

	public String getUpdate_dt() {
		return update_dt;
	}

	public void setUpdate_dt(String update_dt) {
		this.update_dt = update_dt;
	}

	public List<DollarRes> getDollarDetail() {
		return dollarDetail;
	}

	public void setDollarDetail(List<DollarRes> dollarDetail) {
		this.dollarDetail = dollarDetail;
	}

	public ExchangeRateRes(String update_dt, List<DollarRes> dollarDetail) {
		this.update_dt = update_dt;
		this.dollarDetail = dollarDetail;
	}

	public ExchangeRateRes() {
	}
}
