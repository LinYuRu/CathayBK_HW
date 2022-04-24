package com.m3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DollarsSaveRes {
	@JsonProperty("status")
	private String status = null;
	
	@JsonProperty("message")
	private String message = null;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DollarsSaveRes(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	public DollarsSaveRes() {}
}
