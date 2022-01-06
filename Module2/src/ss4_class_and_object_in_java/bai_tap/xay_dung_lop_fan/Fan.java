package ss4_class_and_object_in_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String status = "";
        if (this.isOn()) {
            status += "fan is on" + "\n";
            if (this.speed == 1) {
                status += "speed is SLOW" + "\n";
            } else if (this.speed == 2) {
                status += "speed is MEDIUM" + "\n";
            } else {
                status += "speed is FAST" + "\n";
            }

        } else {
            status += "fan is off" + "\n";
        }
        status += "color of this fan is " + this.color + "\n";
        status += "radius of this fan is " + this.radius + "\n";
        return status;
    }
}
