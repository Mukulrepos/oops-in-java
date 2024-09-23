import java.util.Scanner;

public class except {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            String inputA = sc.nextLine();

            try {
                double a = Integer.parseInt(inputA);
                
                System.out.println("Enter the second number:");
                String inputB = sc.nextLine();

                try {
                    double b = Integer.parseInt(inputB);

                    try {
                        double result = a / b;
                        System.out.println("Result is: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException: Cannot convert '" + inputB + "' to a number.");
                }

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Cannot convert '" + inputA + "' to a number.");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);

            }
        }
    }
}
