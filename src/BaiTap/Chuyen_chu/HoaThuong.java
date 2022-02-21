package BaiTap.Chuyen_chu;

import java.util.Scanner;

public class HoaThuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }

        str = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi chuyển: " + str);
    }
}
