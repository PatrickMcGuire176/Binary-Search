package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int valueAdder;
        int result = 0;
        int counter = 0;
        int searchingFor = 100;
        int index = 0;

        List<Integer> values = new ArrayList<Integer>(10);
        Random randomizer = new Random();

        for (int i = 0; i < 1000; i++) {
            valueAdder = randomizer.nextInt((100 - 0) + 1) + 0;
            values.add(valueAdder);
        }
        System.out.println(values.size());
        Collections.sort(values);
        System.out.println(values);
        int lowerBound = 1;
        int upperBound = values.size();

        while (result != searchingFor) {
            result = values.get((lowerBound + upperBound) / 2);
            index = (lowerBound + upperBound) / 2;
            if (result < searchingFor) {
                lowerBound = index;
                counter++;
            } else if (result > searchingFor) {
                upperBound = index;
                counter++;
            } else if (result == searchingFor) {
                System.out.println("Found");

            }
        }
        System.out.println("found value " + result + " with " + counter+ " loops");
    }

}
