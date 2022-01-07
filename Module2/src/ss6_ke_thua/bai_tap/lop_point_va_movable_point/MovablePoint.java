package ss6_ke_thua.bai_tap.lop_point_va_movable_point;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = getXSpeed();
        array[1] = getYSpeed();
        return array;
    }
    public MovablePoint move(){
     setX(getX()+getXSpeed());
     setY(getY()+getYSpeed());
     return this;
    }
    @Override
    public String toString() {
        return "(x,y) ="+"( "+getX()+" , "+getY()+" )"+" , "+"speed="+" ("+getXSpeed()+" , "+getYSpeed()+" )";
    }
}
