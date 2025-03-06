package com.bankdetails.constructbankac;

public class Payment {
	double totalam;
	
	int paidam;
	String bankName;
	String PaymentBroker;
	
	public Payment(double totalam, int paidam, String bankName, String paymentBroker) {
		super();
		this.totalam = totalam;
		this.paidam = paidam;
		this.bankName = bankName;
		PaymentBroker = paymentBroker;
	}

	@Override
	public String toString() {
		return "Payment [totalam=" + totalam + ", paidam=" + paidam + ", bankName=" + bankName + ", PaymentBroker="
				+ PaymentBroker + "]";
	}

}
