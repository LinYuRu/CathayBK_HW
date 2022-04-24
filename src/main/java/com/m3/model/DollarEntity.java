package com.m3.model;

public class DollarEntity {

    private int dollarId;
    private String dollarkind;
    private String dollar_name;
    
    

	public DollarEntity(int dollarId, String dollarkind, String dollar_name) {
		super();
		this.dollarId = dollarId;
		this.dollarkind = dollarkind;
		this.dollar_name = dollar_name;
	}
	
	public int getDollarId() {
		return dollarId;
	}
	public void setDollarId(int dollarId) {
		this.dollarId = dollarId;
	}
	public String getDollarkind() {
		return dollarkind;
	}
	public void setDollarkind(String dollarkind) {
		this.dollarkind = dollarkind;
	}
	public String getDollar_name() {
		return dollar_name;
	}
	public void setDollar_name(String dollar_name) {
		this.dollar_name = dollar_name;
	}
    
    
}
