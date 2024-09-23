
import java.util.Scanner;

// import java.util.Scanner;
public class except{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the frist number");
            int a = sc.nextInt();
            System.out.println("enter the second number ");
            int b = sc.nextInt();
           try {
            int result = a/b;
            System.out.println("result is "+result);
               
           } catch (ArithmeticException e) {
            System.out.println("dont enter the 0"+e.getMessage());
            }// catch(NumberFormatException e){
        //     System.out.println("enter the number is "+e.getMessage());

        //    }

        } 
    }
}