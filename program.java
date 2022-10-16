
// Написать программу вычисления n-ого треугольного числа

/*
public class program {
    public static void main(String[] args) {

        System.out.print("n = ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int count = 2;
        int tr_number = 1;

        if (n == 1) System.out.println("Треугольное число = 1");
        else {
            while (count <= n) {
            tr_number = tr_number + count;
            count ++;
        }
            System.out.println("Треугольное число = " + tr_number);
        }
    }
}
 */


// Реализовать алгоритм пирамидальной сортировки (HeapSort)

import java.util.Arrays;

public class program {
    public static void heapify(int[] array, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < length && array[left] > array[largest]) {
            largest = left;
        }
        if (right < length && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            int tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;
            heapify(array, length, largest);
        }
    }

    public static void heapSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] array = {25, 12, 6, 41, 18, 31, 53};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}