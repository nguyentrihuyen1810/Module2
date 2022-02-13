package _04_class_and_object_in_java.bai_tap.xd_lop_Fan;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius = 5.0f;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan is on: speed: " + speed + " - color: " + color + " - radius: " + radius;
        } else {
            return "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        fan2.setOn(false);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        System.out.println("Fan 1: ");
        System.out.println(fan1);

        System.out.println("Fan 2:");
        System.out.println(fan2);
    }
}
