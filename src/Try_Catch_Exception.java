public class Try_Catch_Exception {
    static void main() {
//        int[] marks= {88,87,99,97};
//        try {
//            System.out.println(marks[5]);
//        }
//        catch (ArrayIndexOutOfBoundsException e) {                         //For simple: catch (Exception e) {...}
//            System.out.println("Error: Index is out of bounds! " + e.getMessage());
//        }
//        System.out.println("Program Completed.");

        //Another Example Division by Zero (ArithmeticException. Handling illegal mathematical operations.
//        int[] numbers = {10, 20, 30};
//        try {
//            // Uncomment one to see different catches:
//            int result = numbers[1] / 0;   // Triggers ArithmeticException
//            // int item = numbers[10];     // Triggers ArrayIndexOutOfBoundsException
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Math error: " + e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index error: " + e.getMessage());
//        }
//        catch (Exception e) {
//            // Catches any other unexpected error
//            System.out.println("General error: " + e.getMessage());
//        }

//        //Another Example Invalid Number Input (NumberFormatException).When a user enters text instead of digits.
//        String userInput = "apple"; // Not a valid integer
//        try {
//            int age = Integer.parseInt(userInput); // Tries to convert String to int
//            System.out.println("Your age is: " + age);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid input! Please enter digits only. Details: " + e.getMessage());
//        }
//

        //Example 3: Multiple catch Blocks. A single try can have multiple catch blocks to handle different errors differently.
//        int[] numbers = {10, 20, 30};
//        try {
//            // Uncomment one to see different catches:
//            int result = numbers[1] / 0;   // Triggers ArithmeticException
//            // int item = numbers[10];     // Triggers ArrayIndexOutOfBoundsException
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Math error: " + e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index error: " + e.getMessage());
//        }
//        catch (Exception e) {
//            // Catches any other unexpected error
//            System.out.println("General error: " + e.getMessage());
//        }


        //Example 4: try-catch-finally. The finally block always executes, whether an error occurred or not (commonly used for cleanup, closing scanners, files, etc.).
        try {
            System.out.println("Step 1: Opening file/connection...");
            int error = 5 / 0; // Error happens here
        } catch (ArithmeticException e) {
            System.out.println("Step 2: Caught an error: " + e.getMessage());
        } finally {
            // ALWAYS runs no matter what!
            System.out.println("Step 3: Clean up and close connection.");
        }
    }
}
