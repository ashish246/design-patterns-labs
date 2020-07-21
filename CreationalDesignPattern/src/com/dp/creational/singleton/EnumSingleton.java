package com.dp.creational.singleton;

/**
 * Enum, as written in java docs, provide implicit support for thread safety and
 * only one instance is guaranteed.
 * 
 * @author Administrator
 *
 */
public enum EnumSingleton {

	INSTANCE;

	public void someMethod(String param) {
		// some class member
	}
}