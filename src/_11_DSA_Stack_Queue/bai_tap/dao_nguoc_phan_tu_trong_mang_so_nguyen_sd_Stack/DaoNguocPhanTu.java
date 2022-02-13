package _11_DSA_Stack_Queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_sd_Stack;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Nhập số lượng phần tử thêm vào mảng: ");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử vào mảng: ");
            int number = Integer.parseInt(scanner.nextLine());
            arr[i] = number;
            stack.push(number);
        }

        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
