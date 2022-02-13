package _04_class_and_object_in_java.thuc_hanh.lop_hcn;

import java.util.Scanner;

public class Rectangle {
    //Tạo lớp Rectangle, khai báo thuộc tính, định nghĩa các phương thức khởi tạo
    double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Định nghĩa các phương thức
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle {" + "width = " + ", height = " + height + "}";
    }

    //Tạo class Main
    public static void main(String[] args) {
        //Khai báo các biến lưu kích thước hcn và gán giá trị
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the height");
        double height = scanner.nextDouble();

        //Khởi tạo 1 đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);

        //Gọi các phương thức của lớp Rectangle thông qua dốid tượng Rectangle đã tạo để hiển thị các thông số của hcn
        System.out.println("Your Rectangle \n" + rectangle);
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}