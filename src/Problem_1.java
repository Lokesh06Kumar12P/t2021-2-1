import java.util.Scanner;

public class Problem_1 {
    private double a;
    private double b;

    public Problem_1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        Problem_1 calculator = new Problem_1(a, b);

        try {
            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Result: " + calculator.add());
                    break;
                case "subtract":
                    System.out.println("Result: " + calculator.subtract());
                    break;
                case "multiply":
                    System.out.println("Result: " + calculator.multiply());
                    break;
                case "divide":
                    System.out.println("Result: " + calculator.divide());
                    break;
                default:
                    System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
