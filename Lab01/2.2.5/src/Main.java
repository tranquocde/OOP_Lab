import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in );
        String StrNum1 = keyboard.next();
        String StrNum2 = keyboard.next();
        double num1 = Double.parseDouble(StrNum1);
        double num2 = Double.parseDouble(StrNum2);
        System.out.printf("Sum of 2 numbers : %.2f \n" , num1 + num2);
        System.out.printf("Difference of 2 numbers : %.2f \n" , Math.abs(num2 - num1));
        System.out.printf("Product of 2 numbers : %.2f \n" , num1*num2);
        if (num2 == 0){
            System.out.println("Invalid divisor\n");
        }
        else {
            System.out.printf("The quotient of 2 numbers is : %.2f\n" , num1 / num2);
        }
    }

}
