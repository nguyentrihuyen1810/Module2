package _06_ke_thua.bai_tap.lop_Point_va_MoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void getSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] setSpeed() {
        float[] res = new float [] {getxSpeed(), getySpeed()};
        return res;
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                "x = " + getX() +
                ", y = " + getY() +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(10);
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxSpeed(6);
        movablePoint.setySpeed(15);
        System.out.println(movablePoint.toString());
    }
}
