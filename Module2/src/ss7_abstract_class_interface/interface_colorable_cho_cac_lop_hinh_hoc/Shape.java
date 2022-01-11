package ss7_abstract_class_interface.interface_colorable_cho_cac_lop_hinh_hoc;

public class Shape {
    private String color = "black" ;
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        if(isFilled()){
            return "A Shape with color of " + getColor() + " and filled";
        } else {
            return "A Shape with color of " + getColor() + " and not filled";
        }
    }
}
