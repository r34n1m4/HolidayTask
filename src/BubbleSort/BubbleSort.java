package BubbleSort;

public class BubbleSort {
    void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    //swap array[j + 1] and array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    //print the array
    void printArray(int[] array) {
        int n = array.length;
        for (int j : array) System.out.println(j + " ");
        System.out.println();
    }
}
