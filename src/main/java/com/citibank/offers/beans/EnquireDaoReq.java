/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.beans;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
public class EnquireDaoReq {

	private String promocode;
	private String clientId;
	private String msgTs;
	private String corelationId;
	/**
	 * @return the promocode
	 */
	public String getPromocode() {
		return promocode;
	}
	/**
	 * @param promocode the promocode to set
	 */
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the msgTs
	 */
	public String getMsgTs() {
		return msgTs;
	}
	/**
	 * @param msgTs the msgTs to set
	 */
	public void setMsgTs(String msgTs) {
		this.msgTs = msgTs;
	}
	/**
	 * @return the corelationId
	 */
	public String getCorelationId() {
		return corelationId;
	}
	/**
	 * @param corelationId the corelationId to set
	 */
	public void setCorelationId(String corelationId) {
		this.corelationId = corelationId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnquireDaoReq [promocode=");
		builder.append(promocode);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", msgTs=");
		builder.append(msgTs);
		builder.append(", corelationId=");
		builder.append(corelationId);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
