package com.binay.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
        linkedList.add(21);
        linkedList.add(25);
        linkedList.add(32);
        linkedList.add(28);
        linkedList.add(50);
    }

    @Test
    public void testLinkedList() {
        String expected = "[Head: 21] -> 25 -> 32 -> 28 -> [Tail: 50]";
        assertEquals(expected, linkedList.toString());
        assertEquals(expected, linkedList.toString());
    }

    @Test
    public void testLinkedList_Size() {
        int expected = 5;
        assertEquals(expected, linkedList.getSize());
        assertEquals(expected, linkedList.getSize());
    }

    @Test
    public void testLinkedList_Search1() {
        assertTrue(linkedList.search(25));
    }

    @Test
    public void testLinkedList_Search2() {
        assertFalse(linkedList.search(250));
    }

    @Test
    public void testLinkedList_Insert1() {
        assertEquals(5, linkedList.getSize());
        assertFalse(linkedList.insert(432, 10));
        assertEquals(5, linkedList.getSize());
    }

    @Test
    public void testLinkedList_Insert2() {
        assertEquals(5, linkedList.getSize());
        assertTrue(linkedList.insert(432, 2));
        assertTrue(linkedList.search(432));
        assertEquals(6, linkedList.getSize());
    }

    @Test
    public void testLinkedList_Remove1() {
        assertTrue(linkedList.remove(21));
        assertEquals(4, linkedList.getSize());
    }

    @Test
    public void testLinkedList_Remove2() {
        assertTrue(linkedList.remove(25));
        assertEquals(4, linkedList.getSize());
    }

    @Test
    public void testLinkedList_Remove3() {
        assertTrue(linkedList.remove(28));
        assertEquals(4, linkedList.getSize());
    }

    @Test
    public void testLinkedList_Remove4() {
        assertTrue(linkedList.remove(50));
        assertEquals(4, linkedList.getSize());
    }

    @Test
    public void testLinkedList_Remove5() {
        assertFalse(linkedList.remove(289));
        assertEquals(5, linkedList.getSize());
    }
}