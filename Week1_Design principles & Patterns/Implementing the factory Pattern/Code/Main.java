package com.singleton;
public class Main {
	public static void main(String[] args) {
	Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();
    logger1.log("Starting application...");
    logger2.log("Application is running...");
    System.out.println("Are both loggers the same instance? " + (logger1 == logger2));
}
}
