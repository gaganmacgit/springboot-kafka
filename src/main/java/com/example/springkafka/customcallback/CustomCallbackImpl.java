package com.example.springkafka.customcallback;

public class CustomCallbackImpl implements Callback {

	@Override
	public void onSuccess() {
		System.out.println(" Inside CustomCallbackImpl for onSuccess");
	}

	@Override
	public void onError() {
		System.out.println(" Inside CustomCallbackImpl for onError");
	}

}
