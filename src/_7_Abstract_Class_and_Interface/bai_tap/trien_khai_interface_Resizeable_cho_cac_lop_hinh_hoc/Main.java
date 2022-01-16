package _7_Abstract_Class_and_Interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;


import _7_Abstract_Class_and_Interface.bai_tap.Shape.Circle;
import _7_Abstract_Class_and_Interface.bai_tap.Shape.Rectangle;
import _7_Abstract_Class_and_Interface.bai_tap.Shape.Shape;
import _7_Abstract_Class_and_Interface.bai_tap.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square(3.5, "orange", true);
        shape[1] = new Rectangle(5.0, 6.5, "blue", true);
        shape[2] = new Circle(6.5);

        ((Square) shape[0]).resize(20);
        ((Rectangle) shape[1]).resize(30);
        ((Circle) shape[2]).resize(40);

        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }

    }
}