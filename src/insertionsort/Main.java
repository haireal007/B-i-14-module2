package insertionsort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + arr.length + " values:");
        for (
                int i = 0;
                i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (
                int i = 0;
                i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        InsertionSort sapXepChen = new InsertionSort();
        System.out.println("Mang du lieu dau vao: ");
        sapXepChen.display(arr);
        System.out.println("-----------------------------");
        sapXepChen.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepChen.display(arr);
    }
    }


