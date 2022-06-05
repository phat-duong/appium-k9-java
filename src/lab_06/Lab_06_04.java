package lab_06;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab_06_04 {
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    public static String[] options = {
            "1- Check http or https ",
            "2- Check domain",
            "3- Check .com or . net",
    };

    public static void main(String[] args) {
        String url = "https://google.com";
        System.out.println("URL is: " + url);
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=4){
            printMenu(options);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Prefix of URL is: " + checkHttp(url));
                    break;
                case 2:
                    System.out.println("Domain of URL is: " + checkDomainName(url));
                    break;
                case 3:
                    System.out.println("Postfix of URL is: " + checkDotCom(url));

                    break;
                default:
                    System.out.println("Your option is invalid");

            }

        }
    }




    public static String checkHttp(String url){
        String[] prefix = url.split("://");
        return prefix[0];
    }

    public static String checkDomainName(String url){
        String[] result = url.split("://");
        String sub_url = result[1];
        String postfix = url.substring((url.length()-4), url.length());
        String domain = sub_url.replace(postfix, "");
        return domain;
    }

    public static String checkDotCom(String url){
        String postfix = url.substring((url.length()-4), url.length());
        return postfix;
    }

}
