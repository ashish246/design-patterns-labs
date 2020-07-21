package com.dp.creational.singleton;

public class StaticBlockSingleton {
	private static final StaticBlockSingleton INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Uffff, i was not expecting this!", e);
		}
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}

	private StaticBlockSingleton() {
		// ...
	}
}