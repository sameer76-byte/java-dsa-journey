import java.util.Scanner;

public class Calculator2 {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    while (true) {
        System.out.print("Press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and 0 to exit: ");
        int choice= sc.nextInt();
        System.out.print("Enter the first number: ");
        float num1= sc.nextFloat();
        System.out.print("Enter the second number: ");
        float num2= sc.nextFloat();
        switch (choice){
            case 1:
                System.out.println("The sum is: "+(num1+num2));
                break;
            case 2:
                System.out.println("The difference is: "+(num1-num2));
                break;
            case 3:
                System.out.println("The product is: "+(num1*num2));
                break;
            case 4:
                System.out.println("The quotient is: "+(num1/num2));
                break;
            case 0:
                System.out.println("Exiting the calculator.");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");

        }
    }
}
}
