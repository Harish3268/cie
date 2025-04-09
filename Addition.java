import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Performing addition
        int sum = num1 + num2;

        // Displaying the result
        System.out.println("The sum is: " + sum);
        
        scanner.close();
    }
}
System.out.print("Enter second number: ");
int num2 = scanner.nextInt();