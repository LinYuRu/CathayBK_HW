package com.m3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DollarSaveReq {
	@JsonProperty("dollar_kind")
	private String dollar_kind;
	
	@JsonProperty("dollar_name")
	private String dollar_name;

	public String getDollar_kind() {
		return dollar_kind;
	}

	public void setDollar_kind(String dollar_kind) {
		this.dollar_kind = dollar_kind;
	}

	public String getDollar_name() {
		return dollar_name;
	}

	public void setDollar_name(String dollar_name) {
		this.dollar_name = dollar_name;
	}

	public DollarSaveReq(String dollar_kind, String dollar_name) {
		this.dollar_kind = dollar_kind;
		this.dollar_name = dollar_name;
	}
	
	public DollarSaveReq() {}
}
