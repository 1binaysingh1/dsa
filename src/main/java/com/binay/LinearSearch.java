package com.binay;

public class LinearSearch {
    public static void main(String[] args) {
        int[] sample1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(linearSearch(sample1, 5));
    }

    //Return the index of found value or return -1
    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
