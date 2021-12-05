// Program that sets number 1 as dog, number 2 as cat, and chick as number 3 and 
// outputs the animal in English when you enter the number.
// When other numbers are entered, 'I don't know' is printed.

// @author: Oudone PKL

import java.util.Scanner;

public class SetsNumber {
    
    // method for check the number to animals
    public static void setsNum(int num) {

        String animal = "";

        if (num == 1) {
            animal = "Dog";
        } else if (num == 2) {
            animal = "Cat";
        } else if (num == 3) {
            animal = "Chicken";
        } else {
            animal = "I don't know!";
        }

        System.out.println(animal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        // call the method
        setsNum(num);
    }
}
