
// @author: Oudone PKL

import java.util.Scanner;

public class TestArray1 {

    // method for check array
    public static void checkArray(int num) {
        // Create variables
        int[][] table = new int[num][num];
        int time = 0;

        for(int row = 0; row < num; row++) {
            for(int col = 0; col < num; col++) {
                time++;
                table[row][col] = time;
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num = sc.nextInt();

        // call the method
        checkArray(num);
    }
}