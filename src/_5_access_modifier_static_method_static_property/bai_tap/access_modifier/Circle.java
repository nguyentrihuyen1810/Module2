package _5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {

    private double radius = 1.0f;
    private String color = "red";

    public Circle() {
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }
}
