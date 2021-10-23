package binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 10, 11, 14, 4, 5};
        int target = 11;

        Arrays.sort(nums);

        System.out.println(binarySearch1(nums, 1, 14, target));

        System.out.println(Arrays.binarySearch(nums, target));

    }


    public static int binarySearch1(int[] nums, int first, int last, int target) {
        int index = Integer.MAX_VALUE;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (nums[mid] < target) {
                first = mid + 1;
            } else if (nums[mid] > target) {
                last = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }
}