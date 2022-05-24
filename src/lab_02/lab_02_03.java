<<<<<<< HEAD
package lab_02;

import java.util.Scanner;

public class lab_02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        double clientHeight = scanner.nextDouble();
        System.out.print("Please enter your weight(kg): ");
        double clientWeight = scanner.nextDouble();
        double BMI = clientWeight/(clientHeight * 2);

        if (BMI < 18.5){
            System.out.println("Underweight");
            System.out.println("You should increase weight");
        }else if(BMI <= 24.9){
            System.out.println("Normal weight");
            System.out.println("Your body is great");
        }else if(BMI <= 29.9){
            System.out.println("Overweight");
            System.out.println("You should decrease weight");
        }else{
            System.out.println("Obesity");
            System.out.println("You should decrease weight");
        }
    }
=======
package lab_02;public class lab_02_03 {
>>>>>>> origin/main
}
