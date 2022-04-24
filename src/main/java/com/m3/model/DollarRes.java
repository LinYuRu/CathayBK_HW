package com.m3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DollarRes {
	@JsonProperty("code")
	private String code = null;

	@JsonProperty("dollar_name")
	private String dollar_name = null;

	@JsonProperty("rate")
	private String rate = null;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDollar_name() {
		return dollar_name;
	}

	public void setDollar_name(String dollar_name) {
		this.dollar_name = dollar_name;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "DollarRes [code=" + code + ", dollar_name=" + dollar_name + ", rate=" + rate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((dollar_name == null) ? 0 : dollar_name.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DollarRes other = (DollarRes) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (dollar_name == null) {
			if (other.dollar_name != null)
				return false;
		} else if (!dollar_name.equals(other.dollar_name))
			return false;
		if (rate == null) {
			if (other.rate != null)
				return false;
		} else if (!rate.equals(other.rate))
			return false;
		return true;
	}

}
