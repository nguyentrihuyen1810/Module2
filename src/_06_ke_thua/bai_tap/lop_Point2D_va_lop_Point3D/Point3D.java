package _06_ke_thua.bai_tap.lop_Point2D_va_lop_Point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void getXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] setXYZ() {
        float[] res = new float[] {getX(),getY(),z};
        return res;
    }

    public String toString() {
        return "Point2D {" +
                "x = " + getX() +
                ", y = " + getY() +
                ", z = " + getZ() +
                '}';
    }

    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.setXY(5.0f,10.5f);
        System.out.println(point);

        point = new Point3D(point.getX(), point.getY(),15.0f);
        System.out.println(point);
    }
}
