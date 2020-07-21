package com.dp.creational.factorymethod;

public abstract class Creator 
{
	public void anOperation() 
	{
		Product product = factoryMethod();
	}
	
	protected abstract Product factoryMethod();
}