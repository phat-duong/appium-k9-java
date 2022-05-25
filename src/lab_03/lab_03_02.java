package lab_03;

public class lab_03_02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int max = intArr[0];
        int min = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        System.out.println("Maximum numbers = " + max);

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        System.out.println("Minimum numbers = " + min);
    }
}
