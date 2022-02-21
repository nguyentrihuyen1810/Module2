package BaiTap.Chuyen_chu;

import java.util.Scanner;

public class ThuongHoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();

        //sử dụng phương thức toCharArray chuyển chuỗi sang mảng kiểu char
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 95 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }

        //chuyển char sang kiểu chuỗi
        str = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi được chuyển: " + str);
    }
}
