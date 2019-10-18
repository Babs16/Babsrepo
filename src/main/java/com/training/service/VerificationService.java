package com.training.service;

public interface VerificationService {

	public boolean verifyCardValidity(String cardNumber);
	
	public boolean makeCardDefault(String cardNum);

	// Interface contains Abstract methods only (Abstract methods are methods that contains definition but without body)

    public int enterPasscode(int userPasscode);

    public String memData(String memoInfo);

    public boolean enterPinNum(int PinNum);


}
