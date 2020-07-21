package com.dp.others.dependencyinversion;

/**
 * Below is the code which supports the Dependency Inversion Principle. In this
 * new design a new abstraction layer is added through the IWorker Interface.
 * Now the problems from the above code are solved(considering there is no change
 * in the high level logic):
 * 
 * Manager class doesn't require changes when adding SuperWorkers. Minimized
 * risk to affect old functionality present in Manager class since we don't
 * change it. No need to redo the unit testing for Manager class.
 * 
 * @author Administrator
 *
 */
public class ManagerWithDI {

	IWorker worker;

	public void setWorker(IWorker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}