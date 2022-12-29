package MergeSort;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        //create an array
        int[] array = {10, 5, 15, 50, 30, 35};
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(array));

        MergeSort object = new MergeSort();
        object.mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}
