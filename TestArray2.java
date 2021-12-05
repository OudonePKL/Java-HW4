import java.util.Scanner;


public class TestArray2 {

    // Method for check array
    public static void checkArray(int num) {

        // variables
        int[][] table = new int[num][num];
        int time = 0;
        int change = 1;

        // Loop for get data to array
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                time++;
                table[row][col] = time;
            }

            // Check the data and display to screen
            if (change % 2 == 0) {
                for (int col = num - 1; col >= 0; col--) {
                    System.out.print(table[row][col] + " ");
                }
            } else {
                for (int col = 0; col < num; col++) {
                    System.out.print(table[row][col] + " ");
                }
            }

            System.out.println();
            change++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // call the method
        checkArray(num);
    }
}
