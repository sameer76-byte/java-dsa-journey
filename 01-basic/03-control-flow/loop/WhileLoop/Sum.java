//Write a program that continues to take input until the user enters -1, then prints the sum (using `while`).
import java.util.Scanner;
public class Sum {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        float sum=0;
        System.out.println("Enter numbers to sum, enter -1 to stop: ");
        float num = sc.nextFloat();
        while (num != -1){
            sum +=num; //sum=sum+num
            num = sc.nextFloat();
            
        }
        System.out.println("The sum is: "+sum);
    }
}
