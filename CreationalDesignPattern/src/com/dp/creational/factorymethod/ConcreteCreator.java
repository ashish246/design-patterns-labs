package com.dp.creational.factorymethod;

public class ConcreteCreator extends Creator 
{
	protected Product factoryMethod() 
	{
		return new ConcreteProduct();
	}
}