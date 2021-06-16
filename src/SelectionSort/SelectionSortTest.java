package SelectionSort;

public class SelectionSortTest {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {1, 3, 5, 6, 2};
        ss.sort(arr);
        System.out.println("Sorted array");
        ss.printArray(arr);

    }

}
