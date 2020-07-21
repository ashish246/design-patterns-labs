package com.dp.creational.singleton;

/**
 * Bill pugh was main force behind java memory model changes. His principle
 * “Initialization-on-demand holder idiom” also uses static block but in
 * different way.
 * 
 * As you can see, until we need an instance, the LazyHolder class will not be
 * initialized until required and you can still use other static members of
 * BillPughSingleton class.
 * 
 * @author Administrator
 *
 */
public class BillPughSingleton {

	private BillPughSingleton() {
	}

	private static class LazyHolder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}