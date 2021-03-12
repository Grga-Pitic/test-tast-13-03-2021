package com.company.task2;

import java.util.*;

public class Task2 {

    public static void remove3andMoreNumberInARow(List<Integer> list) {

        List<int[]> rangesToRemove = new ArrayList<int[]>();

        int index = -1;
        int startRepsIndex = 0;
        int previousNumber = 0;


        for (int number : list) {
            index++;

            if (number == previousNumber) { // серия  началась/продолжается
                continue;
            }

            // серия прервана
            previousNumber = number;

            if ((index - startRepsIndex) >= 3) {
                rangesToRemove.add(new int[]{startRepsIndex, index});
            }

            startRepsIndex = index;
        }
        // проверка серии в конце массива
        index++;
        if ((index - startRepsIndex) >= 3) {
            rangesToRemove.add(new int[]{startRepsIndex, index});
        }

        removeRanges(list, rangesToRemove);

    }

    private static void removeRanges(List<Integer> list, List<int[]> ranges) {
        for (int i = ranges.size() - 1; i >= 0; i--) {
            list.subList(ranges.get(i)[0], ranges.get(i)[1]).clear();
        }
    }


    public static void remove3andMoreNumber(List<Integer> list) {

        Map<Integer, Integer> numbersCounter = new HashMap<Integer, Integer>();
        Set<Integer> numbersToRemove = new HashSet<Integer>();

        for (int number : list) {
            if (numbersToRemove.contains(number)) {
                continue;
            }

            incNumberCounter(number, numbersCounter);

            if (numbersCounter.get(number) >= 3) {
                numbersToRemove.add(number);
            }
        }

        list.removeAll(numbersToRemove);

    }

    private static void incNumberCounter(int number, Map<Integer, Integer> numbersCounter) {
        if (numbersCounter.containsKey(number)) {
            numbersCounter.put(number, numbersCounter.get(number) + 1);
            return;
        }
        numbersCounter.put(number, 1);
    }

}
