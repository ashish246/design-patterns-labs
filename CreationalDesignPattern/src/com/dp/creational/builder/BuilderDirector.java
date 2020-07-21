package com.dp.creational.builder;

/**
 * Let’s discuss a common problem in our application. In any user management
 * module, primary entity is User, let’s say. Ideally and practically as well,
 * once a user object is fully created, you will not want to change it’s state.
 * It simply does not make sense, right? Now, let’s assume, our User object has
 * following 5 attributes i.e. firstName, lastName, age, phone and address.
 * 
 * In normal practice, if you want to make a immutable User class, then you must
 * pass all five information as parameters to constructor.
 * 
 * Now what if only firstName and lastName are mandatory and rest 3 fields are
 * optional. Problem !! We need more constructors.
 * 
 * Now let’s introduce our sixth attribute i.e. salary. Now it is problem.
 * 
 * One way it to create more constructors, and another is to loose the
 * immutability and introduce setter methods. You choose any of both options,
 * you loose something, right?
 * 
 * Here, builder pattern will help you to consume additional attributes while
 * retaining the immutability of Use class.
 * 
 * @author Administrator
 *
 */
public class BuilderDirector {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Ashish", "Tripathi").age(30)
				.phone("1234567").address("Fake address 1234").build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("Jack", "Reacher").age(40)
				.phone("5655")
				// no address
				.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Super", "Man")
		// No age
		// No phone
		// no address
				.build();

		System.out.println(user3);
	}

}
