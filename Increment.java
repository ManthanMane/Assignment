import java.util.Scanner;

public class Increment {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        age = age + 1;  // Increment age by 1

        System.out.println("Next year you will be: " + age);
    }
}
