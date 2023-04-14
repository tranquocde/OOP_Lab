import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of your array :");
        int n = keyboard.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter each element of your array");
        for (int i = 0 ; i < n ; i ++){
            arr[i] = keyboard.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }
}
