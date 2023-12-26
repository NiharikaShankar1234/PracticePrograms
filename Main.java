package Sorting;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        int[] arrayToSort = {5, 2, 8, 1, 3};

        //BubbleSort
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayToSort.clone());
        System.out.println("BubbleSort Result: " + Arrays.toString(arrayToSort));

        //SelectionSort
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arrayToSort.clone());
        System.out.println("SelectionSort Result: " + Arrays.toString(arrayToSort));
    }
}
