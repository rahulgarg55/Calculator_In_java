import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Welcome to the simple calculator");
        System.out.println("Enter two numbers:");
System.out.println("Number 1: ");
        double num1=scanner.nextDouble();

        System.out.println("Number 2: ");
        double num2=scanner.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1/2/3/4): ");

        int choice=scanner.nextInt();

        double result=0;

        switch(choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid choice!");
                return;
        }
        System.out.println("Result: "+result);
    }
}