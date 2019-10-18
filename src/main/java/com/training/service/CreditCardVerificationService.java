package com.training.service;

public class CreditCardVerificationService implements VerificationService{

	@Override
	public boolean verifyCardValidity(String cardNumber) {
		return false;
	}

	@Override
	public boolean makeCardDefault(String cardNum) {

		return false;
	}

    @Override
    public int enterPasscode(int userPasscode) {
        return 0;
    }

    @Override
    public String memData(String memoInfo) {
        return null;
    }

    @Override
    public boolean enterPinNum(int PinNum) {
        return false;
    }



}
