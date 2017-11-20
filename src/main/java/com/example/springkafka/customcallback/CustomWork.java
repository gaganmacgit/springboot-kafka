package com.example.springkafka.customcallback;

import java.util.List;

public class CustomWork {

	public static void main(String[] args) {

		CustomWork customWork = new CustomWork();
		CustomResult performSomeActivity = customWork.performSomeActivity();
		System.out.println(" performSomeActivity ()  returned ");
		performSomeActivity.addCallback(new Callback() {

			@Override
			public void onSuccess() {
				System.out.println(" inner class onsuccess() ");
			}

			@Override
			public void onError() {

			}
		});
	}

	public CustomResult performSomeActivity() {

		CustomResult customResultObject = new CustomResult();
		Runnable operation = () -> {
			System.out.println(" some long running task before sleeping");
			try {
				Thread.sleep(7000);
				System.out.println(" some long running task woke up");
				List<Callback> callBackList = CustomResultCallbackRegistry.callBackList;
				callBackList.forEach((result) -> {
					result.onSuccess();
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};
		// some long running operation
		Thread someLongRunningTask = new Thread(operation);
		someLongRunningTask.start();
		
		return customResultObject;
	}
}
