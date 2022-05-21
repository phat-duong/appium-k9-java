package lab_02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a time: ");
        int arrivalTime = scanner.nextInt();
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        if(isHeOnTime){
            System.out.println("Let's talk");
        }else {
            System.out.println("Write a letter");
        }

        //Ternary operater
        String outputMessage = isHeOnTime ? "Let's talk" : "Write a letter";
        System.out.println(outputMessage);
    }
}
