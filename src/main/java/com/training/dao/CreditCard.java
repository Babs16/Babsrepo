package com.training.dao;

import java.math.BigDecimal;

import com.training.model.Card;

public class CreditCard extends Card {

	private BigDecimal maxAllowedAmount;

	private BigDecimal annualInterest;

	public BigDecimal getMaxAllowedAmount() {
		return maxAllowedAmount;
	}

	public void setMaxAllowedAmount(BigDecimal maxAllowedAmount) {
		this.maxAllowedAmount = maxAllowedAmount;
	}

	public BigDecimal getAnnualInterest() {
		return annualInterest;
	}

	public void setAnnualInterest(BigDecimal annualInterest) {
		this.annualInterest = annualInterest;
	}

	public void clear() {
		System.out.println("Inside credit card clear method");
		this.maxAllowedAmount = new BigDecimal("0.0");
		this.annualInterest = new BigDecimal("0.0");

	}
	
	/*
	 * public void clear(boolean all) { setCardCvv(""); setCardHolderName("");
	 * this.maxAllowedAmount = new BigDecimal("0.0"); this.annualInterest = new
	 * BigDecimal("0.0"); }
	 */

}
