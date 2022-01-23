package MVC.model.service;

import MVC.model.model.Student;
import MVC.model.repository.IStudentRepository;
import MVC.model.repository.StudentRepository;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;

    @Override
    public void add() {
        System.out.println("Nhập mã học sinh: ");
        int codeStudent = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên học sinh: ");
        String nameStudent = scanner.nextLine();
        System.out.println("Nhập ngày, tháng, năm sinh: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập điểm của học sinh: ");
        double point = Double.parseDouble(scanner.nextLine());

        Student newstudent = new Student(codeStudent, nameStudent, dayOfBirth, point);
        iStudentRepository.add(newstudent);

        System.out.println("Danh sách học sinh sau khi thêm học sinh mới");
        Student[] students = iStudentRepository.getAll();
        for (Student student: students) {
            if (student == null) {
                break;
            }
            System.out.println(student);
        }
    }

    public static int search(Student[] students, int code) {
        boolean check = false;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            if (students[i].getCodeStudent() == code) {
                check = true;
                count = i;
            }
        }
        if (check == false) {
            System.out.println("Mã học sinh không tồn tại");
        }
        return count;
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã học sinh cần xóa: ");
        int codeStudent = Integer.parseInt(scanner.nextLine());
        Student[] students = iStudentRepository.getAll();
        int count = search(students, codeStudent);
        for (int i = 0; i < students.length; i++) {
            if (students[count] == null) {
                break;
            }
            students[i] = students[i - 1];
        }
        System.out.println("Học sinh đã được xóa khỏi danh sách");
    }

    @Override
    public void display() {
        Student[] students = iStudentRepository.getAll();
        for (Student student: students) {
            if (student == null) {
                break;
            }
            System.out.println(student);
        }
    }
}
