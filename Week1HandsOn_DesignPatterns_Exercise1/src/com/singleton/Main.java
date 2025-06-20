package com.singleton;

public class Main {
    public static void main(String[] args) {
      
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting the application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Continuing the application...");

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists. Singleton confirmed!");
        } else {
            System.out.println("Multiple instances found. Singleton failed.");
        }
    }
}
