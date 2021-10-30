package com.binay;

public class LinearSearch {
    //Return the index of found value or return -1
    public int linearSearch(int[] data, int target) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {

            System.out.println("Step Counter: " + (++counter));

            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
