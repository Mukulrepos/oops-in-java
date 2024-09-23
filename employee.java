
// import javax.swing.text.DateFormatter;

import java.util.Scanner;
// import java.util.Scanner;

class company{
    protected String emp_name;
    protected int emp_age;
    protected String date;
    company(String emp_name, int emp_age, String date){
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.date = date;

    }
    public void formatDate() {
        LocalDateTime now = LocalDateTime.now(); // Current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(date); // Using the pattern provided by the 'date' variable
        String formattedDateTime = now.format(formatter); // Formatting the current date and time
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
    

}



public class employee {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your name sir/mam ");
        String name = sc.next();
        System.out.println("enter your age sir");
        int age = sc.nextInt();
        System.out.println("enter today date to check the your salary formate is dd-MM-yyyy HH:mm:ss ");
        String date = sc.next();
        company tata = new company(name, age, date);
        

    }
       

    }
    
}
