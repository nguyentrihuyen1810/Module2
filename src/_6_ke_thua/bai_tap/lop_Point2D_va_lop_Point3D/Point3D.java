package _6_ke_thua.bai_tap.lop_Point2D_va_lop_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    private Point3D(float z) {
        this.z = z;
    }

    private Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void String getXYZ() {

    }
}
