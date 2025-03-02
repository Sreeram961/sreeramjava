package org.example.Assignment1.com;

import java.util.LinkedList;

public class RetrieveElementExample {
    public static void main(String[] args) {
        // We Can Create a LinkedList of Strings
        LinkedList<String> stringList = new LinkedList<>();

        stringList.add("Ball");
        stringList.add("Wickets");
        stringList.add("Bat");
        stringList.add("Ground");
        // Retrieve the second element (index 0=Ball, index 1=Wickets, index 2=Bat,index 3=Ground)

        if (stringList.size() > 1) {
            String secondElement = stringList.get(1);
            System.out.println("The second element is: " + secondElement);
        } else {
            System.out.println("The LinkedList does not have a second element.");
        }

    }
}
