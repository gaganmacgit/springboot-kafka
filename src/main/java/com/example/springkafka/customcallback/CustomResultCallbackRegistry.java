package com.example.springkafka.customcallback;

import java.util.ArrayList;
import java.util.List;

public class CustomResultCallbackRegistry {

	public static List<Callback> callBackList = new ArrayList<>();

	public static void addCallBackRegistry(Callback callback) {
		callBackList.add(callback);
	}

}
