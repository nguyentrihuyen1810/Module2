package BaiTap.Kiem_tra_nguyen_am_phu_am;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char charater = scanner.nextLine().charAt(0);

        boolean check = false;

        switch(charater) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                check = true;
        }
        if (check == true) {
            System.out.println(charater + " is a vowel");
        } else {
            if ((charater >= 'a' && charater <= 'z') || (charater >= 'A' && charater <= 'Z')) {
                System.out.println(charater + " is a consonant");
            } else {
                System.out.println(charater + " not in the alphabet");
            }
        }
    }
}
