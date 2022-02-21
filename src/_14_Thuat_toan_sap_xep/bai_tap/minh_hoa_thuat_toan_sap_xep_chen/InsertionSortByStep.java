package _14_Thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list size: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    private static void insertionSortByStep(int[] list) {
        int pos, x;
        boolean check = true;
        for (int k = 1; k < list.length && check; k++) {
            check = false;
            for (int i = 1; i < list.length; i++) {
                x = list[i];
                pos = i - 1;
                while (pos >= 0 && list[pos] > x) {
                    list[pos + 1] = list[pos];
                    pos--;
                }
                list[pos + 1] = x;
            }
            System.out.println("List after the " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
