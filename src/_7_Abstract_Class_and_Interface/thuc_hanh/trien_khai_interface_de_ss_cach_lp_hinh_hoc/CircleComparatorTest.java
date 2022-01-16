package _7_Abstract_Class_and_Interface.thuc_hanh.trien_khai_interface_de_ss_cach_lp_hinh_hoc;

import _7_Abstract_Class_and_Interface.thuc_hanh.trien_khai_interface_cho_cac_lp_hinh_hoc.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
