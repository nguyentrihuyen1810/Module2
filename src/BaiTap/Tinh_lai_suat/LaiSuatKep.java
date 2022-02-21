package BaiTap.Tinh_lai_suat;

import java.util.Scanner;

public class LaiSuatKep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiền gốc: ");
        double p = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập lãi xuất hàng năm: ");
        double r = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập thời gian tiền được đầu tư hoặc vay: ");
        int t = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số lần lãi được gộp trên mỗi đơn vị t: ");
        int n = Integer.parseInt(scanner.nextLine());

        double amount = p * Math.pow(1 + (r/n), n * t);
        double cinterest = amount - p;

        System.out.println("Số tiền lãi sau " + t + "năm: " + cinterest);
        System.out.println("Số tiền gốc lẫn lãi sau " + t + " năm: " + amount);
    }
}
