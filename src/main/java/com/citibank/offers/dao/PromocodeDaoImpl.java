/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.dao;

import com.citibank.offers.beans.EnquireDaoReq;
import com.citibank.offers.beans.EnquireDaoResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.SystemException;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public class PromocodeDaoImpl implements IPromocodeDao{

	@Override
	public EnquireDaoResp enquire(EnquireDaoReq request) throws BusinessException ,SystemException{
		
		//1. get the request from service 
		//2.prepare the request for db
		//3. call the  db get the response
		//4.prepare the dao response from db response
		System.out.println("Enterd into Dao ====="+request);
		
		String dbRespCode="0";   //need to get actual data from database
		String dbRespMsg="Success";
		
		EnquireDaoResp daoResp=new EnquireDaoResp();
		
		try {
			if("0".equals(dbRespCode)) {
				
			daoResp.setRespCode("0");
			daoResp.setRespMsg("Succes");
			daoResp.setCardNum("123456789");
			daoResp.setCardCvvNum("123");
			daoResp.setCustomerName("clark kent");
			daoResp.setExpDate("12-10-2021");
			
      }else if("100".equals(dbRespCode)||"101".equals(dbRespCode ) ||"103".equals(dbRespCode)){
				
				throw new BusinessException(dbRespCode, dbRespMsg);
				
			}else 
			{
				throw new SystemException(dbRespCode, dbRespMsg);
			}
		} catch (BusinessException be) {
			// TODO Auto-generated catch block
			throw be;
		} catch (SystemException se) {
			// TODO Auto-generated catch block
			throw se;
		}
		
		System.out.println("Exit from Dao ====="+daoResp);
		
		return daoResp;
	}

}
