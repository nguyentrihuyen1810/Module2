package _07_Abstract_Class_and_Interface.bai_tap.Shape;

import _07_Abstract_Class_and_Interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
    @Override
    public void resize(double percent) {
        setRadius(getRadius() + (getRadius() * percent/100));
    }
}