import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        // Getting the input
        System.out.print("Enter number: ");
        n = scanner.nextInt();
        
        // Determine if the input is a positive integer
        if (n >= 0) {
            // Line to output the first asterisk
            System.out.println("*");
             
            // Nested Loop 
            // Top of the half diamond
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println("*");
            }

            // Bottom of the half diamond
            for (int i = n - 1; i >= 1; i--) {
                System.out.print("*");
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println("*");
            }

            // Line to output the last asterisk
            System.out.println("*");
        } else {
            // Error message if the input is a negative number
            System.out.println("Invalid input. Please enter a non-negative number.");
        }
    }
}