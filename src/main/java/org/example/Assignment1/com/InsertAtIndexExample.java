package org.example.Assignment1.com;

import java.util.LinkedList;

public class InsertAtIndexExample {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(15);
        intList.add(20);
        intList.add(30);
        intList.add(35);

        System.out.println("LinkedList before insertion: " + intList);
        int index = 2;
        int element = 25;
        if (index >= 0 && index <= intList.size()) {
            intList.add(index, element);
            System.out.println("LinkedList after insertion: " + intList);
        } else {
            System.out.println("Invalid index: " + index);
        }

    }
}
