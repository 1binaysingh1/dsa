package com.binay;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    private LinearSearch linearSearch;
    private int[] sample1;
    private int[] sample2;

    @BeforeEach
    public void setUp() {
        linearSearch = new LinearSearch();
        sample1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sample2 = new int[]{1, 8, 6, 4, 5, 3, 7, 2, 9, 10};
    }

    @Test
    public void linearSearch_Sorted() {
        int expected = 2;
        int actual = linearSearch.linearSearch(sample1, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void linearSearch_Unsorted() {
        int expected = 6;
        int actual = linearSearch.linearSearch(sample2, 7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void linearSearch_NotFound() {
        int expected = -1;
        int actual = linearSearch.linearSearch(sample2, 70);
        Assertions.assertEquals(expected, actual);
    }
}