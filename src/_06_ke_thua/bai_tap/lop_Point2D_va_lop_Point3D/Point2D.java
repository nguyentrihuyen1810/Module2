package _06_ke_thua.bai_tap.lop_Point2D_va_lop_Point3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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

    public float[] getXY() {
        float[] res = new float [] {x,y};
        return res;
    }

    @Override
    public String toString() {
        return "Point2D {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
