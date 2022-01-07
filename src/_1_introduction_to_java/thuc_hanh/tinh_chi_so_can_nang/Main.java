package _1_introduction_to_java.thuc_hanh.tinh_chi_so_can_nang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;

        System.out.println("Enter your weight (in kilogram): ");
        weight = scanner.nextDouble();

        System.out.println("Enter your height (in meter): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("BMI: " + bmi);

        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
