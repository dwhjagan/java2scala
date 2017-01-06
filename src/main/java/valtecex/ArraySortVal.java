package valtecex;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

class ArraySortVal {
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
      //  char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};

        Arrays.sort(numbers);


        System.out.println(binarySearch(numbers, 1.9));

    }
}