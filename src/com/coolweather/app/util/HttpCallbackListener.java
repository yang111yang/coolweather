package com.coolweather.app.util;
/**
 * �ص����񷵻صĽ��
 * @author Administrator
 *
 */
public interface HttpCallbackListener {
	
	void onFinish(String response);
	
	void onError(Exception e);
	
	
}
