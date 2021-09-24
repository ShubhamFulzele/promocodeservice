/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.svcclient;

import com.citibank.offers.beans.CardSvcClientReq;
import com.citibank.offers.beans.CardSvcClientRes;
import com.citibank.offers.beans.EnquireDaoReq;
import com.citibank.offers.beans.EnquireDaoResp;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public interface ICardVerifyServiceClient {

	CardSvcClientRes enquire(CardSvcClientReq request);
}
