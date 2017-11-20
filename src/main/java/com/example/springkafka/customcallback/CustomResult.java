package com.example.springkafka.customcallback;

public class CustomResult {

	public String getResult() {

		System.out.println(" getResult () ");
		return "success";
	}

	public void addCallback(Callback callback) {

		System.out.println(" addCallback ");
		CustomResultCallbackRegistry.addCallBackRegistry(callback);
	}

}
