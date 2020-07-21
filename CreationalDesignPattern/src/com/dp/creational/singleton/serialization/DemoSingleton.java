package com.dp.creational.singleton.serialization;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private volatile static DemoSingleton instance = null;

	public static DemoSingleton getInstance() {
		if (instance == null) {
			instance = new DemoSingleton();
		}
		return instance;
	}

	/**
	 * Added to avoid having two instances for serialization. This method will
	 * be invoked when you will de-serialize the object. Inside this method, you
	 * must return the existing instance to ensure single instance application
	 * wide.
	 * 
	 * @return
	 */
	protected Object readResolve() {
		return instance;
	}

	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}