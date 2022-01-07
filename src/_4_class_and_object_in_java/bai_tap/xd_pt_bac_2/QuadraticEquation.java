package _4_class_and_object_in_java.bai_tap.xd_pt_bac_2;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        delta = ((this.b * this.b ) - (4 * this.a * this.c));
        return delta;
    }

    public double getRoot1() {
        return ((- this.b + Math.sqrt(getDiscriminant())) / 2 * this.a);
    }

    public double getRoot2() {
        return ((- this.b - Math.sqrt(getDiscriminant())) / 2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Ngiệm 1: " + quadraticEquation.getRoot1());
        }
    }
}
