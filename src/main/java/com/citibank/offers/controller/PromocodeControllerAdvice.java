/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.PromcodeRequestInvalidException;
import com.citibank.offers.exception.SystemException;

/**
 * @author Shubham by 23-Sep-2021
 *
 */
@ControllerAdvice
public class PromocodeControllerAdvice {

	@ExceptionHandler(value = PromcodeRequestInvalidException.class)
	@ResponseBody
	public EnquireResp handlePromcodeRequestInvalidException(PromcodeRequestInvalidException exception) {
		exception.printStackTrace();
		return prepareErrorResponse(exception.getErrorCode(), exception.getErrorMsg());
	}

	@ExceptionHandler(value = BusinessException.class)
	@ResponseBody
	public EnquireResp handleBusinessException(BusinessException exception) {
		return prepareErrorResponse(exception.getErrorCode(), exception.getErrorMsg());
	}

	@ExceptionHandler(value = SystemException.class)
	@ResponseBody
	public EnquireResp handleSystemException(SystemException exception) {
		return prepareErrorResponse(exception.getErrorCode(), exception.getErrorMsg());
	}

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public EnquireResp handleGenericException(Exception exception) {
		exception.printStackTrace();
		return prepareErrorResponse("99999", "Unkown Error");
	}

	private EnquireResp prepareErrorResponse(String errorCode, String errorMsg) {
		EnquireResp response = new EnquireResp();
		response.setRespCode(errorCode);
		response.setRespMsg(errorMsg);
		return response;
	}

}
