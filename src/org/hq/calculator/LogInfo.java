package org.hq.calculator;

public class LogInfo {
	public static void printInfo(String info) {
		System.out.println("Calculate Info:" + info);
	}

	public static void printError(String error) {
		System.out.println("caculate Error:" + error);
	}

	public static void printExStack(String stackName, ExStack _exStack) {
		System.out.println("caculate Content of " + stackName + ":");
		StringBuffer stackStr = new StringBuffer("");
		String[] dataStr = _exStack.getDataArray();
		for (int i = 0; i < _exStack.size(); i++) {
			stackStr.append(" " + dataStr[i]);
		}
		System.out.println("caculate" + stackStr.toString());
	}
}
