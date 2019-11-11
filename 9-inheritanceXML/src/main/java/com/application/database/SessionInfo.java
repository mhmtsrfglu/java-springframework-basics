/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

public class SessionInfo {
	
	private String info1;
	private String info2;

	public SessionInfo() {
		
	}

	public SessionInfo(String info1, String info2) {
		this.info1 = info1;
		this.info2 = info2;
	}

	public String getInfo1() {
		return info1;
	}

	public void setInfo1(String info1) {
		this.info1 = info1;
	}

	public String getInfo2() {
		return info2;
	}

	public void setInfo2(String info2) {
		this.info2 = info2;
	}
	
	

}


