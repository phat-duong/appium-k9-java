package lab_06;

import java.util.Scanner;

public class Lab_06_02 {
    public static void main (String [] args)
    {
        String myPassword = "password123";

        for (int passAttempts = 0; passAttempts < 3; passAttempts++)
        {
            System.out.print("Enter Your Password: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (!(inputPass.equals(myPassword)))
            {
                System.out.println("Wrong Password Try Again");
            }
            else
            {
                System.out.println("Welcome!");
                break;
            }
        }
    }
}
