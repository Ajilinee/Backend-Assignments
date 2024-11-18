package day3;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int result = 0;
        
        try {
            String numStr = "10";
            int num = Integer.parseInt(numStr); 
            result = 100 / num;  
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block will always be executed, regardless of whether an exception occurs or not.
            System.out.println("Finally block executed.");
        }

        // Code after the try-catch-finally block
        System.out.println("Program execution continues after the try-catch-finally block.");
    }
}


