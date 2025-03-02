package org.example.Assignment1.com;

import java.util.LinkedList;

public class CheckContainmentExample {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);

        System.out.println("LinkedList: " + intList);

        int elementToCheck = 60;

        if (intList.contains(elementToCheck)) {
            System.out.println("The LinkedList contains the element: " + elementToCheck);
        } else {
            System.out.println("The LinkedList does not contain the element: " + elementToCheck);
        }

    }
}
