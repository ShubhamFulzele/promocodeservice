/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.validator;

import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.exception.PromcodeRequestInvalidException;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public class PromocodeServiceValidator {
	
	public void requestValidate(EnquireRequest request) throws PromcodeRequestInvalidException {
		
		if(request.getPromocode()==null || " ".equals(request.getPromocode())) {
				
			throw new PromcodeRequestInvalidException("prc001", "Invalid promocode");
		}
	
		if(request.getClientId() == null || " ".equals(request.getClientId())) {
			
			throw new PromcodeRequestInvalidException("prc002", "promocode Expired");
		}
	}

}
