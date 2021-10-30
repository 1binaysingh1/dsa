package com.binay.linkedlist;

import java.util.Objects;

/**
 * Implementation of Singly LinkedList Data Structure.
 * Attributes:
 *      head: The head node of the list
 *      size: Number of nodes inside the list
 * @param <E>
 */
public class LinkedList<E> {
    private Node head;
    private int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }


    /**
     * Object to hold the data and next data in the list.
     * Attributes:
     *      data: The actual data held by the node.
     *      next: Reference to the next node.
     */
    private class Node {
        private E data;
        private Node next;

        Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return getData().equals(node.getData()) && Objects.equals(getNext(), node.getNext());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getData(), getNext());
        }
    }

    /**
     * Adds new Node containing data to tail of the list.
     * Increments size value by one after successful addition.
     * Takes O(n) time.
     * @param data
     */
    public void add(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
    }

    /**
     * Inserts new Node containing data at the specified index position.
     * Returns true on success and false if fails.
     * Index count starting from 0.
     * Increments size value by one after successful insertion.
     * Takes O(n) time.
     * @param data
     * @param index
     * @return
     */
    public boolean insert(E data, int index) {
        if (index == 0) {
            add(data);
            size++;
            return true;
        }
        if (index > 0 && size > index) {
            int position = index;
            Node current = head;
            
            while (position > 1) {
                current = current.next;
                position--;
            }
            
            Node prev = current;
            Node next = current.next;
            
            Node node = new Node(data);
            prev.next = node;
            node.next = next;

            size++;
            return true;
        }
        return false;
    }

    /**
     * Search for the first Node containing data that matches the target.
     * Returns true if found and false if not found.
     * Takes O(n) time.
     * @param target
     * @return
     */
    public boolean search(E target) {
        Node current = head;
        if (current.data.equals(target)) {
            return true;
        } else {
            while (current.next != null) {
                if (current.next.data.equals(target)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    //Use size variable instead of this method
    public int size() {
        int counter = 0;
        if (head == null) {
            return counter;
        } else {
            counter++;
        }
        Node current = head;
        while (current.next != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    /**
     * Removes Node containing data that matches the target.<br>
     * Returns true if Node is found and removed, otherwise returns false.<br>
     * Takes O(n) time.
     * @param target The data to be removed.
     * @return boolean value (whether removed or not)
     */
    public boolean remove(E target) {
        Node current = head;
        Node prev;

        if (current.data.equals(target)) {
            head = current.next;
            size--;
            return true;
        } else {
            current = current.next;
            prev = current;
        }

        while (current != null) {
            if (current.data.equals(target)) {
                prev.next = current.next;
                size--;
                return true;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return false;
    }

    /**
     * @return Formatted string value of this linked list.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        if (current != null) {
            sb.append("[Head: ").append(current.data).append("]");
            sb.append(" -> ");
            if (current.next == null) {
                sb.append("[null]");
                return sb.toString();
            }
            current = current.next;
            while (current.next != null) {
                sb.append(current.data);
                sb.append(" -> ");
                current = current.next;
            }
            sb.append("[Tail: ").append(current.data).append("]");
        }
        return sb.toString();
    }
}
