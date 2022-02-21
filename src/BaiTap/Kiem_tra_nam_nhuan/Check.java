package BaiTap.Kiem_tra_nam_nhuan;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        boolean check = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                } else
                    check = false;
            } else
                check = true;
        } else {
            check = false;
        }
        if (check == true) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " not a leap year");
        }
    }
}
