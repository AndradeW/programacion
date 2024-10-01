package com.mycompany.Sort;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        for (int y = array.length; y > 0; y--) {
            for (int x = 0; x < y - 1; x++) {
                if (array[x] > array[x + 1]) {
                    int temp = array[x + 1];
                    array[x + 1] = array[x];
                    array[x] = temp;
                }
            }
        }
    }
}
