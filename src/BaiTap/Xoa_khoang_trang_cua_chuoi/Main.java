package BaiTap.Xoa_khoang_trang_cua_chuoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Chuỗi ban đầu: " + str);

        //Phương thức replaceAll để xóa khoảng trắng
        str = str.replaceAll(" ", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + str);
    }
}
