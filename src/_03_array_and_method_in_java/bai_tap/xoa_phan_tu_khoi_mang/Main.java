package _03_array_and_method_in_java.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class Main {
    public static void deleteArray(int[] arr, int index){
        for (int i = index; i < arr.length;i++){
            if (i == (arr.length-1)){
                arr[i] = 0;
            }
            else
                arr[i] = arr[i+1];
        }
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
        for (int i = 0;i < size;i++){
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }

        System.out.print("Enter the element to be deleted: ");
        int valueDel = scanner.nextInt();

        boolean check = false;
        int a = 0;
        for (int i = 0;i < arr.length;i++){
            if (arr [i] == valueDel){
                a = i;
                check = true;
                break;
            }
        }

        if (check){
            System.out.println("Array after deleted: ");
            deleteArray(arr,a);
            for (int i:arr){
                System.out.print(i + " ");
            }

        }
        else
            System.out.println("The element you just entered could not be found in the array");
    }
}

