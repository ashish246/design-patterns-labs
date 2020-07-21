package com.dp.creational.singleton;

/**
 * Please ensure to use “volatile” keyword with instance variable otherwise you
 * can run into out of order write error scenario, where reference of instance
 * is returned before actually the object is constructed i.e. JVM has only
 * allocated the memory and constructor code is still not executed. In this case,
 * your other thread, which refer to uninitialized object may throw null pointer
 * exception and can even crash the whole application.
 * 
 * @author Administrator
 *
 */
public final class LazySingleton {
	private static volatile LazySingleton instance = null;

	// private constructor
	private LazySingleton() {
	}

	// can create multiple instances for parallel thread
	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;

	}

	// double-checked locking to resolve above issue
	public static LazySingleton getInstanceDoubleCheck() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				// Double check
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}