public class test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(arr, 7));


    }

    public static int binarySearch(int[] arr, int item) {
        int guess;
        int mid;
        int low = 0;

        int max = (arr.length) - 1;

        while (low <= max) {
            mid = low + (max - low) / 2;
            guess = arr[mid];

            if (guess == item) {
                return guess;
            } else if (guess > item) {
                max = mid - 1;
            } else low = mid + 1;
        }

        return -10;
    }
}