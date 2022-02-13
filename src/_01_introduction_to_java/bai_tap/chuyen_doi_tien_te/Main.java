package _01_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int VND = 23000;
        System.out.print("Nhập số tiền USD cần đổi: ");
        int USD = scanner.nextInt();
        int tienVND = USD*VND;
        System.out.println("Số tiền sau khi đổi từ USD sang VND: " +tienVND+" VND");
    }
}
