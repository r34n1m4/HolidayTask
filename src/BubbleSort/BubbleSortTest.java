package BubbleSort;

public class BubbleSortTest {
    public static void main(String[] args) {
        BubbleSort object = new BubbleSort();
        int[] array = {5, 1, 4, 2, 8};
        System.out.println("Initial array: ");
        object.printArray(array);
        object.bubbleSort(array);
        System.out.println("Sorted array: ");
        object.printArray(array);
    }
}
