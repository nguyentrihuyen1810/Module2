package BaiTap.Tinh_lai_suat;

import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiền gốc: ");
        double p = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập lãi suất mỗi năm: ");
        double r = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập thời gian gửi(tính bằng năm): ");
        int t = Integer.parseInt(scanner.nextLine());

        double money = (p * r * t)/100;

        System.out.println("Số tiền lãi sau " + t + " năm: " + money);
    }
}
