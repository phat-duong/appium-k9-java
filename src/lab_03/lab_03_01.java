package lab_03;

public class lab_03_01 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i < intArr.length; i++){
            if(intArr[i] % 2 == 1)
                odd_count++;
            else
                even_count++;
        }
        System.out.println("Even numbers = " + even_count);
        System.out.println("Odd numbers = " + odd_count);
    }
}
