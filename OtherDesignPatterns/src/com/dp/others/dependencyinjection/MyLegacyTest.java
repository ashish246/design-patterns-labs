package com.dp.others.dependencyinjection;

/**
 * At first look, there seems nothing wrong with above implementation. But above
 * code logic has certain limitations.
 * 
 * MyApplication class is responsible to initialize the email service and then
 * use it. This leads to hard-coded dependency. If we want to switch to some
 * other advanced email service in future, it will require code changes in
 * MyApplication class. This makes our application hard to extend and if email
 * service is used in multiple classes then that would be even more harder.
 * 
 * If we want to extend our application to provide additional messaging feature,
 * such as SMS or Facebook message then we would need to write another
 * application for that. This will involve code changes in application classes
 * and in client classes too.
 * 
 * Testing the application will be very difficult since our application is
 * directly creating the email service instance. There is no way we can mock
 * these objects in our test classes.
 * 
 * @author Administrator
 *
 */
public class MyLegacyTest {

	public static void main(String[] args) {

		MyLegacyApplication app = new MyLegacyApplication();
		app.processMessages("Hi Ashish", "ashish@abc.com");
	}

}