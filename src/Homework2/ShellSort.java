package Homework2;

public class ShellSort {
    public static void sort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {9, 8, 3, 7, 5, 6, 4, 1};
        sort(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
