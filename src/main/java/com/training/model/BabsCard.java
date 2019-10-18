package com.training.model;

public class BabsCard {

    private int creditCardNumber;
    private int creditCardValidUpto;
    private int creditCardCvv;
    private String creditCardHolderName;
    private String creditCardType;
    protected String balanceTransfer;
    protected int cashTransfer;
    protected String loanFigure;

    public BabsCard(int creditCardValidUpto, int creditCardCvv, String creditCardHolderName, String creditCardType) {
        this.creditCardValidUpto = creditCardValidUpto;
        this.creditCardCvv = creditCardCvv;
        this.creditCardHolderName = creditCardHolderName;
        this.creditCardType = creditCardType;
    }

    public String getBalanceTransfer() {
        return balanceTransfer;
    }

    public void setBalanceTransfer(String balanceTransfer) {
        this.balanceTransfer = balanceTransfer;
    }

    public int getCashTransfer() {
        return cashTransfer;
    }

    public void setCashTransfer(int cashTransfer) {
        this.cashTransfer = cashTransfer;
    }

    public String getLoanFigure() {
        return loanFigure;
    }

    public void setLoanFigure(String loanFigure) {
        this.loanFigure = loanFigure;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCreditCardValidUpto(int creditCardValidUpto){
        this.creditCardValidUpto=creditCardValidUpto;
    }

    public int getCreditCardValidUpto() {
        return creditCardValidUpto;
    }

    public int getCreditCardCvv() {
        return creditCardCvv;
    }

    public void setCreditCardCvv(int creditCardCvv) {
        this.creditCardCvv = creditCardCvv;
    }

    public String getCreditCardHolderName() {
        return creditCardHolderName;
    }

    public void setCreditCardHolderName(String creditCardHolderName) {
        this.creditCardHolderName = creditCardHolderName;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }
    //    public String getCardNumber() {
//        return cardNumber;
//    }
//
//    public void setCardNumber(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public String getCardValidUpto() {
//        return cardValidUpto;
//    }
//
//    public void setCardValidUpto(String cardValidUpto) {
//        this.cardValidUpto = cardValidUpto;
//    }
//
//    public String getCardCvv() {
//        return cardCvv;
//    }
//
//    public void setCardCvv(String cardCvv) {
//        this.cardCvv = cardCvv;
//    }
//
//    public String getCardHolderName() {
//        return cardHolderName;
//    }
//
//    public void setCardHolderName(String cardHolderName) {
//        this.cardHolderName = cardHolderName;
//    }
//
//    public String getCardType() {
//        return cardType;
//    }
//
//    public void setCardType(String cardType) {
//        this.cardType = cardType;
//    }
//
//    protected void checkBalance() {
//        System.out.println("Check balance");

  //  }

    void setMaxWithdrawLimit() {
        System.out.println("Set withdraw limit");

    }

    @Override
    public String toString() {
        return "Card [cardNumber=" + creditCardNumber + ", creditCardValidUpto=" + creditCardValidUpto + ", creditCardCvv=" + creditCardCvv
                + ", creditCardHolderName=" + creditCardHolderName + "]";
    }

    public void clear() {
        System.out.println("Inside card clear method");
        this.creditCardHolderName = "";
        //this.creditCardCvv = "";

    }


   }
