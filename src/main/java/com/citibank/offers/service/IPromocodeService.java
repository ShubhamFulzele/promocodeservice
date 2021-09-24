/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.service;

import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.SystemException;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public interface IPromocodeService {

	 EnquireResp enquire(EnquireRequest request) throws BusinessException, SystemException;
}
