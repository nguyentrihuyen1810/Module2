package _5_access_modifier_static_method_static_property.bai_tap.Xd_lop_chi_ghi_trong_JV;

import java.sql.SQLOutput;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student: " + student1.getName() + " - class: " + student1.getClasses());

        Student student2 = new Student();
        student2.setName("Andy");
        student2.setClasses("A10");

        System.out.println("Student: " + student2.getName() + " - class: " + student2.getClasses());
    }
}
