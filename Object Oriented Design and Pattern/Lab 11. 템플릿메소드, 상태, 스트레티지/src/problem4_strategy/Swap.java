package problem4_strategy;

import java.util.List;

public class Swap {

    public static void main(String[] args) {
        String[] arr = {"1","4","3"};

        swap(arr, 0, 2);
        for (String str : arr) {
            System.out.println(str);
        }
    }
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];

       // System.out.println(temp);
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
