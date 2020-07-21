package com.dp.behavioral.chainofresponsibility;

public class ConcreteHandlerThree extends Handler {
	
	public void handleRequest(Request request) {
		
		if (request.getValue() >= 0) { // if request is eligible handle it
			System.out
					.println("Zero values are handled by ConcreteHandlerThree:");
			System.out.println("\tConcreteHandlerThree.HandleRequest : "
					+ request.getDescription() + request.getValue());
		} else {
			super.m_successor.handleRequest(request);
		}
	}
}