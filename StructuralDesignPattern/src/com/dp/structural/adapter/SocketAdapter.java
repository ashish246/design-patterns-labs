package com.dp.structural.adapter;

/**
 * While implementing Adapter pattern, there are two approaches – class adapter
 * and object adapter, however both these approaches produce same result.
 * 
 * Class Adapter – This form uses java inheritance and extends the source
 * interface, in our case Socket class.
 * 
 * Object Adapter – This form uses Java Composition and adapter contains the
 * source object.
 * 
 * @author Administrator
 *
 */
public interface SocketAdapter {

	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}