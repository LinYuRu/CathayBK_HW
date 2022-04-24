package com.m3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bpi {
	@JsonProperty("code")
	private String code = null;
	@JsonProperty("symbol")
	private String symbol = null;
	@JsonProperty("rate")
	private String rate = null;
	@JsonProperty("description")
	private String description = null;
	@JsonProperty("rate_float")
	private String rate_float = null;
	
	public Bpi code(String code) {
		this.code = code;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Bpi symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public String getsymbol() {
		return symbol;
	}

	public void setsymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public Bpi rate(String rate) {
		this.rate = rate;
		return this;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public Bpi description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Bpi rate_float(String rate_float) {
		this.rate_float = rate_float;
		return this;
	}

	public String getRate_float() {
		return rate_float;
	}

	public void setRate_float(String rate_float) {
		this.rate_float = rate_float;
	}

}
