package _05_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(20);
        System.out.println("Circle 1: radius = " + circle1.getRadius() + " , color: " + circle1.getColor());

        Circle circle2 = new Circle(50);
        System.out.println("Circle 1: radius = " + circle2.getRadius() + " , color: " + circle2.getColor());
    }
}
