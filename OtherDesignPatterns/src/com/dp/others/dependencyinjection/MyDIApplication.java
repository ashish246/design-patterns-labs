package com.dp.others.dependencyinjection;

/**
 * Notice that our application class is just using the service. It does not
 * initialize the service that leads to better “separation of concerns“. Also
 * use of service interface allows us to easily test the application by mocking
 * the MessageService and bind the services at runtime rather than compile time.
 * 
 * @author Administrator
 *
 */
public class MyDIApplication implements Consumer {

	private MessageService service;

	public MyDIApplication(MessageService svc) {
		this.service = svc;
	}

	@Override
	public void processMessages(String msg, String rec) {
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}