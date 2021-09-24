/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.exception;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public class PromcodeRequestInvalidException extends Exception {
	
	private String errorCode;
	private String errorMsg;
	
	public PromcodeRequestInvalidException(String errorCode ,String errorMsg){
		this.errorCode=errorCode;
		this.errorMsg=errorMsg;
		}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	
	

}
