package bai_tap_lam_them_quan_ly_xe.models;

public class Motorbike extends Vehicles{
    private int cubicCentimeter;

    public Motorbike() {
    }

    public Motorbike(String licensePlate, String manufacturer, int manufactureYear, String owner, int cubicCentimeter) {
        super(licensePlate, manufacturer, manufactureYear, owner);
        this.cubicCentimeter = cubicCentimeter;
    }

    public int getCubicCentimeter() {
        return cubicCentimeter;
    }

    public void setCubicCentimeter(int cubicCentimeter) {
        this.cubicCentimeter = cubicCentimeter;
    }

    @Override
    public String toString() {
        return super.toString()+
                " cubicCentimeter=" + cubicCentimeter;
    }
}
