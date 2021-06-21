package problem4_strategy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuickSort extends SortStrategy {

    public static int partition(String[] arr, int start, int end) {
        String pivotValue = arr[start];
        while (start < end) {
            String value1;
            String value2;
            while ((value1 = arr[start]).compareTo( pivotValue ) < 0) {
                start = start + 1;
            }
            while ((value2 = arr[end]).compareTo( pivotValue ) > 0) {
                end = end - 1;
            }
            arr[start] = value2;
            arr[end] = value1;
        }
        return start;
    }
    public static void quickSort(String[] arr, int start, int end) {
        if (start >= end) {
            // we are done
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex+1, end);
    }

    @Override
    public List<String> sort(List<String> list) {
        String[] arr = list.toArray(new String[0]);


        quickSort(arr,0,arr.length-1);
        list = Arrays.asList(arr);

        System.out.println("Quick Sorted list");
        return list;
    }
}
