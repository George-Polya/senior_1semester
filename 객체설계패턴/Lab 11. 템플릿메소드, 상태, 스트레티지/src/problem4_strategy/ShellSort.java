package problem4_strategy;

import java.util.Arrays;
import java.util.List;

public class ShellSort extends SortStrategy {

    public static void shellSort(String[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                String key = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap].compareTo(key) > 0) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }

    }


    @Override
    public List<String> sort(List<String> list) {
        String[] arr = list.toArray(new String[0]);

        shellSort(arr);
        list = Arrays.asList(arr);

        System.out.println("Shell Sorted list");
        return list;
    }
}
