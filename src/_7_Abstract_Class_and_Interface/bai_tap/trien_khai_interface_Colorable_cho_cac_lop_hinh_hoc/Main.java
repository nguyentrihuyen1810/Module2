package _7_Abstract_Class_and_Interface.bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

import _7_Abstract_Class_and_Interface.bai_tap.Shape.Circle;
import _7_Abstract_Class_and_Interface.bai_tap.Shape.Rectangle;
import _7_Abstract_Class_and_Interface.bai_tap.Shape.Shape;
import _7_Abstract_Class_and_Interface.bai_tap.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(6.0);
        shape[1] = new Rectangle(5.0, 7.0,"orange", false);
        shape[2] = new Square(5.0, "blue", false);

        //Toán tử instanceof trong java được sử dụng để kiểm tra một đối tượng có phải là thể hiển của một kiểu dữ liệu
        // cụ thể không (lớp, lớp con, interface). instanceof trong java được gọi là toán tử so sánh kiểu vì nó so sánh
        // thể hiện với kiểu dữ liệu. Nó trả về giá trị boolean là true hoặc false. Nếu bạn dùng toán tử instanceof với
        // bất kỳ biến nào mà có giá trị null, giá trị trả về sẽ là false.

        for (int i = 0; i < shape.length; i++) {
            System.out.println("Area: ");
            if (shape[i] instanceof Circle) {
                System.out.println("The area Circle: " + ((Circle)shape[i]).getArea());
            } else if (shape[i] instanceof Rectangle) {
                System.out.println("The area Rectangle: " + ((Rectangle)shape[i]).getArea());
            } else if (shape[i] instanceof Square) {
                System.out.println("The area Square: " + ((Square)shape[i]).howtoColor);
            }
        }
    }
}
