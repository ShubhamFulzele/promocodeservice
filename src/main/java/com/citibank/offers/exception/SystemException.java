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
public class SystemException  extends Exception{
	private String errorCode;
	private String errorMsg;
	 public SystemException(String erroCode, String errorMsg){
		 this.errorCode=erroCode;
		 this.errorMsg=erroCode;
		 
		 
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
