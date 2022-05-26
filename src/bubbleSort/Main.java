package bubbleSort;

import static bubbleSort.BubbleSort.list;

public class Main {
    public static void main(String[] args) {
        BubbleSort.bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
