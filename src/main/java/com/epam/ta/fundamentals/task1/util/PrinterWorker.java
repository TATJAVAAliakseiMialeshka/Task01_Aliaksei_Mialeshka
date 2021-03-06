package com.epam.ta.fundamentals.task1.util;

public class PrinterWorker {

	public static void printErrorString(String errorStr) {
		if (null != errorStr && !errorStr.isEmpty()) {
			System.out.println(errorStr);
		}
	}

	public static void printString(String resutlStr) {
		if (null != resutlStr && !resutlStr.isEmpty()) {
			System.out.print(resutlStr);
		}
	}

	public static void printString(boolean result) {
		System.out.println(result);
	}

	public static void printFormatString(String string, Object... args) {
		if (null != string && !string.isEmpty() && null != args) {
			System.out.printf(string, args);
		}
	}
}
