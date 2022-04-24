package com.m3.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DollarReq {
	  @JsonProperty("time")
	  private Time time;

	  @JsonProperty("disclaimer")
	  private String disclaimer = "";
	  
	  @JsonProperty("chartName")
	  private String chartName = "";

	  @JsonProperty("bpi")
	  private List<Bpi> bpi = new ArrayList<Bpi>();



	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public String getDisclaimer() {
		return disclaimer;
	}


	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}


	public String getChartName() {
		return chartName;
	}


	public void setChartName(String chartName) {
		this.chartName = chartName;
	}


	public List<Bpi> getBpi() {
		return bpi;
	}


	public void setBpi(List<Bpi> bpi) {
		this.bpi = bpi;
	}


	public DollarReq(Time time, String disclaimer, String chartName, List<Bpi> bpi) {
		this.time = time;
		this.disclaimer = disclaimer;
		this.chartName = chartName;
		this.bpi = bpi;
	}


	public DollarReq() {}
}
