package lab_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18){
            System.out.println("Không bán");
            if (clientAge < 14){
                System.out.println("Call 911......");
            }
        }else if(clientAge <=55){
            System.out.println("Unlimited");
        }else{
            System.out.println("2 chai");
        }
    }
}
