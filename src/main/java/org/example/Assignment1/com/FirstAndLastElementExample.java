package org.example.Assignment1.com;

import java.util.LinkedList;

public class FirstAndLastElementExample {
    public static void main(String[] args) {

        LinkedList<String> stringList = new LinkedList<>();

        stringList.add("Sree");
        stringList.add("Ravan");
        stringList.add("Krish");
        stringList.add("Ram");

        System.out.println("LinkedList: " + stringList);

        if (!stringList.isEmpty()) {
            String firstElement = stringList.getFirst();
            String lastElement = stringList.getLast();

            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The LinkedList is empty.");
        }
    }
}
