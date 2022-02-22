package quan_ly_dien_thoai.models;

public class UnauthorizedPhone extends Phone{
private String originCountry;
private String repairedStatus;

    public UnauthorizedPhone() {
    }

    public UnauthorizedPhone(String originCountry, String repairedStatus) {
        this.originCountry = originCountry;
        this.repairedStatus = repairedStatus;
    }

    public UnauthorizedPhone(String id, String nameOfPhone, double price, int quantity, String manufacturer, String originCountry, String repairedStatus) {
        super(id, nameOfPhone, price, quantity, manufacturer);
        this.originCountry = originCountry;
        this.repairedStatus = repairedStatus;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getRepairedStatus() {
        return repairedStatus;
    }

    public void setRepairedStatus(String repairedStatus) {
        this.repairedStatus = repairedStatus;
    }

    @Override
    public String toString() {
        return "UnauthorizedPhone{" +
                "originCountry='" + originCountry + '\'' +
                ", repairedStatus='" + repairedStatus + '\'' +
                '}';
    }
    public String getUnauthorizedPhoneToString(){
        return super.getPhoneToString()+","+this.originCountry+","+this.repairedStatus;
    }
}
