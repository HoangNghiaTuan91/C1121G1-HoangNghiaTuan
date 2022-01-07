package ss6_ke_thua.bai_tap.lop_point_va_movable_point;

public class MainMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint();
        System.out.println(movablePoint1.toString());
        movablePoint1.setSpeed(2f,3f);
        System.out.println(movablePoint1.toString());
        MovablePoint movablePoint2 = new MovablePoint(10.0f,10.0f);
        System.out.println(movablePoint2.toString());
        movablePoint2.setSpeed(20.0f,15.0f);
        movablePoint1.move();
        movablePoint2.move();
        System.out.println(movablePoint1.toString());
        System.out.println(movablePoint2.toString());
    }
}
