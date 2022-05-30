package lab_03;

import java.util.Arrays;

public class lab_03_03 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 16, 28};

        int temp;
            for (int i = 0 ; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

        System.out.printf("Array sorts from min to max : %s", Arrays.toString(arr));
    }
}
