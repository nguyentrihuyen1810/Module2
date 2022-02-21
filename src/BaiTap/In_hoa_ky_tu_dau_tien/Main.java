package BaiTap.In_hoa_ky_tu_dau_tien;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Chuỗi ban đầu: " + str);

        String firstLetter = str.substring(0,1);
        String remainingLetters = str.substring(1, str.length());

        //Phương thức toUpperCase() để in hoa
        firstLetter = firstLetter.toUpperCase();

        str = firstLetter + remainingLetters;
        System.out.println("Chuỗi sau khi đã in hoa: " + str);
    }
}
