package problem4_strategy;

import java.util.Arrays;
import java.util.List;

public class MergeSort extends SortStrategy {
    public static void merge(String[] arr, int start, int mid, int end) {
        int n = end - start + 1;
        String[] b = new String[n];
        int i1 = start;
        int i2 = mid + 1;
        int j = 0;


        while (i1 <= mid && i2 <= end) {
            if (arr[i1].compareTo(arr[i2]) < 0) {
                b[j] = arr[i1];
                i1++;
            } else {
                b[j] = arr[i2];
                i2++;
            }
            j++;
        }


        while (i1 <= mid) {
            b[j] = arr[i1];
            i1++;
            j++;
        }


        while (i2 <= end) {
            b[j] = arr[i2];
            i2++;
            j++;
        }


        for (j = 0; j < n; j++) {
            arr[start + j] = b[j];
        }
    }




    public static void mergeSort(String[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }


    @Override
    public List<String> sort(List<String> list) {
        String[] arr = list.toArray(new String[0]);

        mergeSort(arr,0,arr.length-1);
        list = Arrays.asList(arr);

        System.out.println("Merge Sorted list");
        return list;
    }
}
