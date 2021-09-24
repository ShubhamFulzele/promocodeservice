/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.PromcodeRequestInvalidException;
import com.citibank.offers.exception.SystemException;
import com.citibank.offers.service.IPromocodeService;
import com.citibank.offers.service.PromocodeServiceImpl;
import com.citibank.offers.validator.PromocodeServiceValidator;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
@RestController
public class PromocodeController {

	@GetMapping(value = "/enquire/{promocode}")
	public EnquireResp enquire(@PathVariable("promocode") String promocode, 
			                                @RequestHeader(name ="client-id" , required=false) String clientId,
			                                @RequestHeader("msgTs") String msgTs,  
			                                @RequestHeader("corelation-id") String corelationId)throws BusinessException, SystemException, PromcodeRequestInvalidException {

		System.out.println("Enterd into Controlller====" + promocode);
		EnquireResp response = null;
		
			// 1.get the request from client

			// 2.prepare the service request
			EnquireRequest request = new EnquireRequest();
			request.setPromocode(promocode);
			request.setClientId(clientId);
			request.setMsgTs(msgTs);
			request.setCorelationId(corelationId);
			// 3.validate the request
			PromocodeServiceValidator validate = new PromocodeServiceValidator();
			validate.requestValidate(request);

			// 4.call the service and get the service resp
			IPromocodeService service = new PromocodeServiceImpl();
			response = service.enquire(request);
		
		System.out.println("Exit from Controlller====" + response);
		return response;

	}

	public static void main(String[] args) throws BusinessException, SystemException, PromcodeRequestInvalidException {
		PromocodeController controller = new PromocodeController();
		EnquireResp response = controller.enquire("shubh123", "456", "21-09-2021, 12pm", "100-game");
		System.out.println("controller response is :::::::" + response);

	}

}
