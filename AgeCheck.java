import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            
            // Try to read the age as an integer
            try {
                int age = sc.nextInt();
                
                // Check if the age is less than 18
                if (age < 18) {
                    throw new RuntimeException("You are not eligible");
                }
                System.out.println("You are eligible");
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for age.");
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
