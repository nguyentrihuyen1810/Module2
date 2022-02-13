package _11_DSA_Stack_Queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_sd_Stack;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.println("Nhập vào 1 từ: ");
        String string = scanner.nextLine();

        String[] strings = string.split("");
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
        }

        for (int i = 0; i < strings.length; i++) {
            strings[i] = stack.pop();
        }
    }
}
