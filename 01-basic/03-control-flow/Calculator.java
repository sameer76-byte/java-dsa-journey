import java.util.Scanner;
public class Calculator{
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number: ");
        float num1= sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2= sc.nextFloat();
        System.out.println("Enter the operator: ");
        char operator=sc.next().charAt(0);
        if (operator=='+') {
            System.out.println(num1+num2);
        }
        else if (operator=='-') {
            System.out.println(num1-num2);
        }
        else if (operator=='*') {
            System.out.println(num1*num2);
        }
        else if (operator=='/') {
            System.out.println(num1/num2);
        }
        else {
            System.out.println("Invalid operator");
        }
        sc.close(); // closing the scanner object, Good practice to prevent memory leaks
    }
} 
    

