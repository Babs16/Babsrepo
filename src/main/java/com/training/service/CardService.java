package com.training.service;

import java.util.ArrayList;
import java.util.List;

import com.training.model.BabsCard;
import com.training.model.Card;

public class CardService extends BabsCard {

	private static final List<Card> cardList=new ArrayList<>();

	public CardService(int creditCardValidUpto, int creditCardCvv, String creditCardHolderName, String creditCardType) {
		super(creditCardValidUpto, creditCardCvv, creditCardHolderName, creditCardType);
	}


	public void addNewCard(Card card) {
	
		System.out.println("Inside CardService class with method addNewCard");
		cardList.add(card);
		System.out.println("New card added and size of card list is "+ cardList.size());
		
	}
	
	public void deleteCard() {
		
		System.out.println("Inside CardService class with method deleteCard");	
		
	}


	public static void main(String[] args) {
		CardService mynewcard = new CardService(100,208,"Babs Fatade","MasterCard");
		mynewcard.getCreditCardCvv();
		// Why am I seeing priva
	}
	
}
