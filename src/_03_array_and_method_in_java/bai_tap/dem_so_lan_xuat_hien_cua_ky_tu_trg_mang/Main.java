package _03_array_and_method_in_java.bai_tap.dem_so_lan_xuat_hien_cua_ky_tu_trg_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Happy New Year";
        String str1 = str.toLowerCase();
        int count = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a character: ");
        char character = scanner.nextLine().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Have " + count + " character " + character + " in string");
    }
}
