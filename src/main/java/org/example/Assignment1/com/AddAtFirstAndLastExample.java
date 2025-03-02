package org.example.Assignment1.com;

import java.util.LinkedList;

public class AddAtFirstAndLastExample {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        System.out.println("LinkedList before addition: " + stringList);

        stringList.addFirst("Mango");

        stringList.addLast("Date");

        System.out.println("LinkedList after addition: " + stringList);

    }
}
