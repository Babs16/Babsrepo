package com.training.model;

public class Card {
	
	private String cardNumber;
	private String cardValidUpto;
	private String cardCvv;
	private String cardHolderName;
	private String cardType;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardValidUpto() {
		return cardValidUpto;
	}

	public void setCardValidUpto(String cardValidUpto) {
		this.cardValidUpto = cardValidUpto;
	}

	public String getCardCvv() {
		return cardCvv;
	}

	public void setCardCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	protected void checkBalance() {
		System.out.println("Check balance");
		
	}
	
	void setMaxWithdrawLimit() {
		System.out.println("Set withdraw limit");
		
	}

	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", cardValidUpto=" + cardValidUpto + ", cardCvv=" + cardCvv
				+ ", cardHolderName=" + cardHolderName + "]";
	}

	public void clear() {
		System.out.println("Inside card clear method");
		this.cardHolderName = "";
		this.cardCvv = "";

	}
	
	
}
