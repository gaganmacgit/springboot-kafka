package com.example.springkafka.customcallback;

public interface Callback {

	public abstract void onSuccess();
	public abstract void onError();
}
