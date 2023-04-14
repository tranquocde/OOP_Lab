import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter numeber of rows:");
        int row = keyboard.nextInt();
        System.out.println("Enter number of columns:");
        int col = keyboard.nextInt();
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int result[][] = new int[row][col];
        System.out.println("Enter the entries of matrix 1:");
        for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < col; j++) 
                {
                    matrix1[i][j] = keyboard.nextInt();
                }
            
            }
        System.out.println("Enter the entries of matrix 2:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                matrix2[i][j] = keyboard.nextInt();
            }
        
        }
        for (int i =0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j ++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The first matrix is:");
        for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < col; j++) 
                {
                    System.out.print(matrix1[i][j]+" ");
                }
                System.out.println("");
            }
        System.out.println("The second matrix is:");
        for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < col; j++) 
                {
                    System.out.print(matrix2[i][j]+" ");
                }
                System.out.println("");
            }
        System.out.println("The result is:");
        for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < col; j++) 
                {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println("");
            }
        
        
    }
}
