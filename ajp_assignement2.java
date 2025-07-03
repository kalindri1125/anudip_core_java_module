package basiccode;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        long factorial = 1;

        // Factorial logic
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
