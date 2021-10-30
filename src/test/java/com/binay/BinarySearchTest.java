package com.binay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    private BinarySearch binarySearch;
    private int[] sample;

    @BeforeEach
    public void setUp() {
        binarySearch = new BinarySearch();
        sample = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    public void binarySearch_Found() {
        int expected = 3;
        int actual = binarySearch.binarySearch(sample, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_NotFound() {
        int expected = -1;
        int actual = binarySearch.binarySearch(sample, 40);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchRecursive_Found() {
        int expected = 3;
        int actual = binarySearch.binarySearchRecursive(sample, 4, 0, sample.length);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchRecursive_NotFound() {
        int expected = -1;
        int actual = binarySearch.binarySearchRecursive(sample, 40, 0, sample.length);
        assertEquals(expected, actual);
    }
}