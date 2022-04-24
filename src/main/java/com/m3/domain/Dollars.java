package com.m3.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="Dollars")
public class Dollars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dollarId")
    private int dollarId;

    @NotNull
    @Column(name="dollar_kind")
    private String dollar_kind;
    
    @Column(name="dollar_name")
    private String dollar_name;

	public Dollars(int dollarId, String dollar_kind, String dollar_name) {
		super();
		this.dollarId = dollarId;
		this.dollar_kind = dollar_kind;
		this.dollar_name = dollar_name;
	}

	public Dollars() {
		// TODO Auto-generated constructor stub
	}
    
    
}
