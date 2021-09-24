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
public class CardSvcClientRes {
	private String respcode;
	private String resMsg;
	private String status;
	private String desc;
	/**
	 * @return the respcode
	 */
	public String getRespcode() {
		return respcode;
	}
	/**
	 * @param respcode the respcode to set
	 */
	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}
	/**
	 * @return the resMsg
	 */
	public String getResMsg() {
		return resMsg;
	}
	/**
	 * @param resMsg the resMsg to set
	 */
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardSvcClientRes [respcode=");
		builder.append(respcode);
		builder.append(", resMsg=");
		builder.append(resMsg);
		builder.append(", status=");
		builder.append(status);
		builder.append(", desc=");
		builder.append(desc);
		builder.append("]");
		return builder.toString();
	}
	
	

}
