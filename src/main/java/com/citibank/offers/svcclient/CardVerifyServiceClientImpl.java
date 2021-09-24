/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.svcclient;

import com.citibank.offers.beans.CardSvcClientReq;
import com.citibank.offers.beans.CardSvcClientRes;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public class CardVerifyServiceClientImpl implements ICardVerifyServiceClient {

	@Override
	public CardSvcClientRes enquire(CardSvcClientReq request) {
		// 1. get the request from service
		// 2.prepare the request for backend service
		// 3.call the backend service and get the response
		// 4.prepare the svcclient response with the help of backend response
		System.out.println("Enterd into Service client ====="+request);
		CardSvcClientRes Svclientresp =new CardSvcClientRes();
		Svclientresp.setRespcode("0");
		Svclientresp.setResMsg("Succes");
		Svclientresp.setStatus("VALID");
		Svclientresp.setDesc("Good Standard Card");
		
		
		System.out.println("Exit from Service client ====="+Svclientresp);
		return Svclientresp;
	}

}
