package SelectionSort;

public class SelectionSort {
    void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;

                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
            System.out.println();
        }
    }
}
