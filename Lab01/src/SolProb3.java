import java.util.Scanner;
public class SolProb3 {
    public SolProb3(){}
    public void printconfig(int n){
        for (int i = 0 ; i < n; i++){
            int number_of_spaces = n-i;
            int number_of_asterisks = 2*i +1;
            for (int j = 0 ; j < number_of_spaces;j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < number_of_asterisks ; k ++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = keyboard.nextInt();
        SolProb3 sol = new SolProb3();
        sol.printconfig(n);
        System.exit(0);
    }
}
