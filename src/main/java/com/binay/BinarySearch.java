package com.binay;

public class BinarySearch {

    //Return the index of found value or return -1
    public int binarySearch(int[] data, int target) {
        int first = 0;
        int last = data.length - 1;

        int i = 0;
        while (first <= last) {
            System.out.println("Step Counter: " + (++i));
            int mid = (first + last) / 2;
            if (target == data[mid]) {
                return mid;
            } else if (target > data[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] data, int target, int start, int end) {
        if (start >= end) {
            return  -1;
        } else {
            /*
            int mid = (start + end) / 2
            int mid = start + (end - start) / 2
            Both of above will give the same value, however, second one is more reliable.
            Let's understand it with a scenario. Suppose, end value has MAX_INT value in it. now if you add start to MAX_INT
            then there will be overflow issue, assuming start might have non-zero value. But, in the second expression,
            there won't be any problem as we'll be subtracting start from MAX_INT that will not cross the MAX_INT value supported by the language
             */
            int mid = start + (end - start) / 2;
            if (target < data[mid]) {
                return binarySearchRecursive(data, target, start, mid - 1);
            } else if (target > data[mid]) {
                return binarySearchRecursive(data, target, mid + 1, end);
            } else {
                return mid;
            }
        }
    }
}
