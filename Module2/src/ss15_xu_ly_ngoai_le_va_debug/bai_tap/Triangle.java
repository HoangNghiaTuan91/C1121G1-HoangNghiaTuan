package ss15_xu_ly_ngoai_le_va_debug.bai_tap;

public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if (side1<=0||side2<=0||side3<=0){
            throw new IllegalTriangleException("Độ dài cạnh tam giác phải lớn hơn 0");
        } else if(side1+side2<side3||side2+side3<side1||side1+side3<side2){
            throw new IllegalTriangleException("Tổng độ dài 2 cạnh phải lớn hơn độ dài 1 cạnh còn lại");
        }
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
