package com.dp.structural.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Ashish",
				"wrong_pwd");
		try {
			executor.runCommand("ipconfig");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}

}