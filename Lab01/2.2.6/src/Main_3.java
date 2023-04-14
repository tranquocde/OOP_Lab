import java.util.Scanner;

// Second degree equation 

public class Main_3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter value of a :");
        double a = Double.parseDouble(keyboard.next());
        System.out.println("Enter value of b :");
        double b = Double.parseDouble(keyboard.next());
        System.out.println("Enter value of c :");
        double c = Double.parseDouble(keyboard.next());
        if (a == 0){
            System.out.println("Invalid value for a");
        }
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta < 0){
            System.out.println("No solution");
        }
        else if (delta == 0){
            System.out.printf("Solution is %.2f",-b/(2*a));
        }
        else {
            System.out.printf( "Solutions are : %.2f and %.2f",-b/(2*a) + 
            Math.sqrt(delta) , -b/(2*a) - Math.sqrt(delta));
        }

    }
}
