import java.util.Scanner;

public class IT24103868Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        
        System.out.println("\nUser entered numbers are: " + num1 + " " + num2 + " " + num3);

        
        int smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        scanner.close();
    }
}
