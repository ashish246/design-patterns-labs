package com.dp.others.dependencyinversion;

/**
 * Below is an example which violates the Dependency Inversion Principle. We
 * have the manager class which is a high level class, and the low level class
 * called Worker. We need to add a new module to our application to model the
 * changes in the company structure determined by the employment of new
 * specialized workers. We created a new class SuperWorker for this.
 * 
 * Let's assume the Manager class is quite complex, containing very complex
 * logic. And now we have to change it in order to introduce the new
 * SuperWorker. Let's see the disadvantages:
 * 
 * we have to change the Manager class (remember it is a complex one and this
 * will involve time and effort to make the changes).
 * 
 * some of the current functionality from the manager class might be affected.
 * 
 * the unit testing should be redone.
 * 
 * @author Administrator
 *
 */
public class ManagerWithoutDI {

	WorkerWithoutDI worker;

	public void setWorker(WorkerWithoutDI w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}