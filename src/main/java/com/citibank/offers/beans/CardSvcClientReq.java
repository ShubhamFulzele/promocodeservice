/**
  * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.beans;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public class CardSvcClientReq {
	private String CardNum;
	private String Cvv;
	private String ExpDate;
	/**
	 * @return the cardNum
	 */
	public String getCardNum() {
		return CardNum;
	}
	/**
	 * @param cardNum the cardNum to set
	 */
	public void setCardNum(String cardNum) {
		CardNum = cardNum;
	}
	/**
	 * @return the cvv
	 */
	public String getCvv() {
		return Cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(String cvv) {
		Cvv = cvv;
	}
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return ExpDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		ExpDate = expDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardSvcClientReq [CardNum=");
		builder.append(CardNum);
		builder.append(", Cvv=");
		builder.append(Cvv);
		builder.append(", ExpDate=");
		builder.append(ExpDate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
