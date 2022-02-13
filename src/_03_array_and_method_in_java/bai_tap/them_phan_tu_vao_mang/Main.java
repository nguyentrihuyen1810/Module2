package _03_array_and_method_in_java.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class Main {
    public static void insertArray(int []array, int i, int a, int length){
        for (int j = length-1 ;j >= i; j--){
            array[j + 1] = array[j];
        }
        array[i] = a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter a size: ");
        do {
            size = scanner.nextInt();
            if(size > 20)
                System.out.print("Size should not exceed 20");
        }while (size > 20);

        int arr[] = new int [size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter element to be insert: ");
        int valueIns = scanner.nextInt();
        System.out.print("Enter index to be insert: ");
        int index = scanner.nextInt();
        if (index <= 1 || index >= size - 1){
            System.out.println("Element cannot be insert!");
       }
        else {
            insertArray(arr, index, valueIns, size);
            for (int i = 0; i < size + 1; i++){
                System.out.print(arr[i]+ " ");
            }
        }

    }
}

