package _07_Abstract_Class_and_Interface.bai_tap.Shape;

import _07_Abstract_Class_and_Interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public String howtoColor ;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
            Square square = new Square();
            System.out.println(square);

            square = new Square(2.3);
            System.out.println(square);

            square = new Square(5.8, "yellow", true);
            System.out.println(square);
    }

    @Override
    public void resize(double percent) {
        setSide (getSide() + (getSide() * percent/100));
    }
}
