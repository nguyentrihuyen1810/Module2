package _11_DSA_Stack_Queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trg_1_chuoi_sd_Map;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();

        String[] arrString = str.split(" ");
        TreeMap<String, Integer> string = new TreeMap<>();

        for (String i: arrString) {
            if (string.containsKey(i)) {
                int a = string.get(i) + 1;
                string.put(i,a);
                continue;
            }
            string.put(i,1);
        }

        System.out.println(string);
    }
}
