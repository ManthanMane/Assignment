import java.util.Scanner;

public class User {
    public static void main(String[] args)
     {
        String correctId = "1234";  
        String name = "Manthan";
        int age = 30;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String inputId = sc.nextLine();

        if (inputId.equals(correctId)) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
         else 
        {
            System.out.println("User ID not found.");
        }
    }
}
