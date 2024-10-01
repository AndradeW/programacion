package com.mycompany.Sort;

public class InsertionSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        for (int y = 1; y < array.length; y++) {

            int pos = y;
            int temp = array[y];

            while (pos > 0 && array[pos - 1] > temp) {
                array[pos] = array[pos - 1];
                pos--;
            }

            array[pos] = temp;
        }
    }
}
