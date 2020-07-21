package com.dp.behavioral.visitor;

/**
 * Suppose we have an application which manage routers in different
 * environments. Routers should be capable of sending and receiving char data
 * from other nodes and application should be capable of configuring routers in
 * different environment.
 * 
 * Essentially, design should flexible enough to support the changes in way that
 * routers can be configured for additional environments in future, without much
 * modifications in source code.
 * 
 * We have above 3 types of routers and we need to write code for them. One way
 * to solve this problem, is to define methods like configureForWinodws() and
 * configureForLinux() in Router.java interface and implement them in different
 * products, cause each will have it’s own configuration setting and procedure.
 * 
 * But the problem with above approach is that each time a new environment is
 * introduced, whole router’s hierarchy will have to be compiled again.
 * 
 * Visitor pattern is good fit for these types of problems where you want to
 * introduce a new operation to hierarchy of objects, without changing its
 * structure or modifying them. In this solution, we will implement double
 * dispatch technique by introducing two methods i.e. accept() and visit()
 * methods. Method accept(), will be defined in router’s hierarchy and and visit
 * methods will be on visitors level.
 * 
 * Whenever a new environment need to be added, a new visitor will be added into
 * visitors hierarchy and that needs to implement visit() method for all the
 * available routers and that’s all.
 * 
 * @author Administrator
 *
 */
public class TestVisitorPattern {

	private static MacConfigurator macConfigurator;
	private static LinuxConfigurator linuxConfigurator;
	private static DLinkRouter dlink;
	private static TPLinkRouter tplink;
	private static LinkSysRouter linksys;

	public static void main(String[] args) {
		macConfigurator = new MacConfigurator();
		linuxConfigurator = new LinuxConfigurator();

		dlink = new DLinkRouter();
		tplink = new TPLinkRouter();
		linksys = new LinkSysRouter();

		testDlink();
		testTPLink();
		testLinkSys();
	}

	public static void testDlink() {
		dlink.accept(macConfigurator);
		dlink.accept(linuxConfigurator);
	}

	public static void testTPLink() {
		tplink.accept(macConfigurator);
		tplink.accept(linuxConfigurator);
	}

	public static void testLinkSys() {
		linksys.accept(macConfigurator);
		linksys.accept(linuxConfigurator);
	}
}