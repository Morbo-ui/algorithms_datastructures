package quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {

        if(arr.length == 0)
            return 0;
        return 1 + sum(Arrays.copyOfRange(arr, 1, arr.length));
    }

}
