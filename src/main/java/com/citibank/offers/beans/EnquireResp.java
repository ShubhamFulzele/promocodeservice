/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
@JsonInclude(value =Include.NON_NULL)
public class EnquireResp {
	private String respCode;
	private String respMsg;
	private String cardNum;
	private String cardCvvNum;
	private String customerName;
	private String expDate;
	private String status;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}
	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}
	/**
	 * @param respMsg the respMsg to set
	 */
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	/**
	 * @return the cardNum
	 */
	public String getCardNum() {
		return cardNum;
	}
	/**
	 * @param cardNum the cardNum to set
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	/**
	 * @return the cardCvvNum
	 */
	public String getCardCvvNum() {
		return cardCvvNum;
	}
	/**
	 * @param cardCvvNum the cardCvvNum to set
	 */
	public void setCardCvvNum(String cardCvvNum) {
		this.cardCvvNum = cardCvvNum;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnquireResp [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", cardNum=");
		builder.append(cardNum);
		builder.append(", cardCvvNum=");
		builder.append(cardCvvNum);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	

}
