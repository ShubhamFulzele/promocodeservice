/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.service;

import com.citibank.offers.beans.CardSvcClientReq;
import com.citibank.offers.beans.CardSvcClientRes;
import com.citibank.offers.beans.EnquireDaoReq;
import com.citibank.offers.beans.EnquireDaoResp;
import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.dao.IPromocodeDao;
import com.citibank.offers.dao.PromocodeDaoImpl;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.SystemException;
import com.citibank.offers.svcclient.CardVerifyServiceClientImpl;
import com.citibank.offers.svcclient.ICardVerifyServiceClient;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public class PromocodeServiceImpl implements IPromocodeService {

	@Override
	public EnquireResp enquire(EnquireRequest request) throws BusinessException, SystemException {
		// 1.get the request from controller
		// 2.prepare the request for dao
		System.out.println("Enterd into service ====="+request);
		EnquireDaoReq daorequest = new EnquireDaoReq();
		daorequest.setPromocode(request.getPromocode());
		daorequest.setClientId(request.getClientId());
		daorequest.setMsgTs(request.getMsgTs());
		daorequest.setCorelationId(request.getCorelationId());

		// 3 call the dao and get dao response
		IPromocodeDao dao = new PromocodeDaoImpl();
		EnquireDaoResp Daoreponse = dao.enquire(daorequest);

		// 4.prepare the request for service client
		CardSvcClientReq clientRequest = new CardSvcClientReq();
		clientRequest.setCardNum(Daoreponse.getCardNum());
		clientRequest.setCvv(Daoreponse.getCardCvvNum());
		clientRequest.setExpDate(Daoreponse.getExpDate());

		// 5.call the service client and get service client response
		ICardVerifyServiceClient svcclient = new CardVerifyServiceClientImpl();
		CardSvcClientRes svcClientresponse = svcclient.enquire(clientRequest);

		// 6.prepare the service response from dao resp and service resp
		EnquireResp FinalResponse =new EnquireResp();
		FinalResponse.setRespCode(svcClientresponse.getRespcode());
		FinalResponse.setRespMsg(svcClientresponse.getResMsg());
		FinalResponse.setStatus(svcClientresponse.getStatus());
		FinalResponse.setCustomerName(Daoreponse.getCustomerName());
		FinalResponse.setCardNum(Daoreponse.getCardNum());
		FinalResponse.setCardCvvNum(Daoreponse.getCardCvvNum());
		FinalResponse.setExpDate(Daoreponse.getExpDate());
		
		
		
		
		System.out.println("Exit from service ====="+FinalResponse);

		return FinalResponse;
	}

}
