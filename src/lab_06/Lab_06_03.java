package lab_06;

public class Lab_06_03 {
    public static void main(String[] args) {
        String myStr = "100 minutes 234";

        for (char digit : myStr.toCharArray())
        {
            if (Character.isDigit(digit))
            {
                System.out.print(digit);
            }
        }

    }

}
