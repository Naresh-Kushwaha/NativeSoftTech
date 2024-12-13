import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Console Calculator!");
        while (true) {
            try {
                System.out.println("\nEnter the first number (or type 'exit' to quit):");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                }
                double num1 = Double.parseDouble(input);

                System.out.println("Enter the operator (+, -, *, /):");
                char operator = scanner.nextLine().charAt(0);

                System.out.println("Enter the second number:");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                        continue;
                }

                System.out.printf("The result of %.2f %c %.2f is %.2f\n", num1, operator, num2, result);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
