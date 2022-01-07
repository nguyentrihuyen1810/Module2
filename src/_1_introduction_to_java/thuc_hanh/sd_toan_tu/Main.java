package _1_introduction_to_java.thuc_hanh.sd_toan_tu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        area = width * height;
        System.out.println("Area: " + area);
    }

}
