package _06_ke_thua.bai_tap.lop_Circle_va_lop_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder {" +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ", height = " + height +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.0, 6.5, "yellow");
        System.out.println(cylinder);

        System.out.println("Thể tích hình trụ = " + cylinder.getArea());
    }
}
