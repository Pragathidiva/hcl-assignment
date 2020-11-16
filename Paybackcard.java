package com.pojo;

public class Paybackcard extends Card {
	private int pointsEarned;

	private int totalAmount;

	
	public Paybackcard(String holderName, String cardNumber, String expiryDate, int pointsEarned,
			int  totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}
