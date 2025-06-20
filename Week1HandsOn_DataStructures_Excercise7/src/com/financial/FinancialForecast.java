package com.financial;

import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Take input from user
        System.out.print("Enter current value (e.g., 10000): ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter growth rate in % (e.g., 8 for 8%): ");
        double growthRatePercent = scanner.nextDouble();
        double growthRate = growthRatePercent / 100.0;  // Convert to decimal

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Call the recursive method
        double futureValue = predictFutureValue(currentValue, growthRate, years);

        // Display result
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, futureValue);

        scanner.close(); // Always close the scanner
    }
}
