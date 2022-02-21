package BaiTap.Tim_phan_nguyen_va_phan_du;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int phanNguyen = num1 / num2;
        int phanDu = num1 % num2;

        System.out.println(num1 + "/" + num2 + " có phần nguyên là " + phanNguyen + " và phần dư là " + phanDu);
    }
}
