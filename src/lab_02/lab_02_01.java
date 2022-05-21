package lab_02;

import java.util.Scanner;

public class lab_02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        double clientHeight = scanner.nextDouble();
        System.out.print("Please enter your weight(kg): ");
        double clientWeight = scanner.nextDouble();
        double BMI = clientWeight/(clientHeight * 2);

        if (BMI < 18.5){
            System.out.println("Underweight");
        }else if(BMI <= 24.9){
            System.out.println("Normal weight");
        }else if(BMI <= 29.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obesity");
        }
    }
}
