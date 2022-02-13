package _03_array_and_method_in_java.thuc_hanh.ung_dung_dem_so_luong_sinh_vien_do;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a mark for student " + (i + 1) + " ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("The number of students passing the exam is " + count);
    }
}
