package MergeSort;

public class MergeSort {
    void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] M = new int[n2];

        //fill both arrays
        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }

        for (int j = 0; j < n2; j++) {
            M[j] = array[q + 1 + j];
        }


        int i = 0;
        int j = 0;
        int k = p;

        //ascending order sorting at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    //divide an array into 2 sub-arrays -> sort -> merge
    void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            //mid stands for dividing point of the array
            int mid = (left + right) / 2;
            //recursive call to each of sub-arrays
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            //merge sorted sub-arrays
            merge(array, left, mid, right);
        }
    }


}
