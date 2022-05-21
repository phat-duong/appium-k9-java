package lab_02;

import java.util.Scanner;

public class lab_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if(number%2 == 0){
            System.out.println("This is even number");
        }else{
            System.out.println("This is odd number");
        }
    }
}
