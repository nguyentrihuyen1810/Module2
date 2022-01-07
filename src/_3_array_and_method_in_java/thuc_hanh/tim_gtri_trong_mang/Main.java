package _3_array_and_method_in_java.thuc_hanh.tim_gtri_trong_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.print("Position of the student in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.print("Not found " + input_name + " in the list");
        }
    }
}
