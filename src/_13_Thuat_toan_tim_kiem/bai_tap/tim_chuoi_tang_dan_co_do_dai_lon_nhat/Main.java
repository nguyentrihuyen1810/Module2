package _13_Thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));

            for (int j = 0 ; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max) {
            System.out.println(ch);
        }
    }
}
