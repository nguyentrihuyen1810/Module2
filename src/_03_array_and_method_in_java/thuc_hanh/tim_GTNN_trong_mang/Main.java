package _03_array_and_method_in_java.thuc_hanh.tim_GTNN_trong_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int [] array;

        Scanner scanner = new Scanner (System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.print("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list " + min + " at position " + index);
    }
}
