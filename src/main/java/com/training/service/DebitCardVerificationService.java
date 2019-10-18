package com.training.service;

import java.io.Serializable;

public class DebitCardVerificationService implements VerificationService{

	@Override
	public boolean verifyCardValidity(String cardNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean makeCardDefault(String cardNum) {
		// TODO Auto-generated method stub
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

// Implementing the Interface method
    public static void main(String[] args) {
        DebitCardVerificationService bds = new DebitCardVerificationService();
        bds.verifyCardValidity("ValidCard");
        bds.enterPinNum(1666);
    }
}
