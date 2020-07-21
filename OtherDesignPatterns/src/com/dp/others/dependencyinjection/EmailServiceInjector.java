package com.dp.others.dependencyinjection;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		
		return new MyDIApplication(new EmailServiceImpl());
	}

}