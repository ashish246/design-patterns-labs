package com.dp.behavioral.chainofresponsibility;

public class ConcreteHandlerTwo extends Handler
{
	public void handleRequest(Request request)
	{
		if (request.getValue() > 0)
		{           //if request is eligible handle it
			System.out.println("Positive values are handled by ConcreteHandlerTwo:");
			System.out.println("\tConcreteHandlerTwo.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}
        else
		{
			super.m_successor.handleRequest(request);
		}
	}
}