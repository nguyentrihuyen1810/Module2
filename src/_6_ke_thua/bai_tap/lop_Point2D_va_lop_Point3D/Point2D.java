package _6_ke_thua.bai_tap.lop_Point2D_va_lop_Point3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    private Point2D() {

    }

    private Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        float[] arrayXY = new float[] {this.x ,this.y};
        return Arrays.toString(arrayXY);
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2.0f, 5.0f);
        System.out.println(point2D);
    }
}
