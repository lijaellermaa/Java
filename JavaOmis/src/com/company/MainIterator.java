package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Artur");
        names.add("Lija");
        names.add("Oleg");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
