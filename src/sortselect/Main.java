package sortselect;

import static sortselect.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        double[] list = {12, 3, 4, 6, 8, 3, 78, 32, 88, 23, 342};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
