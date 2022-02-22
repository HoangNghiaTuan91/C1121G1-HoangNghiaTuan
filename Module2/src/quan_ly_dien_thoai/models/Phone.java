package quan_ly_dien_thoai.models;

public abstract class Phone {
    private String id;
    private String nameOfPhone;
    private double price;
    private int quantity;
    private String manufacturer;

    public Phone() {
    }

    public Phone(String id, String nameOfPhone, double price, int quantity, String manufacturer) {
        this.id = id;
        this.nameOfPhone = nameOfPhone;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfPhone() {
        return nameOfPhone;
    }

    public void setNameOfPhone(String nameOfPhone) {
        this.nameOfPhone = nameOfPhone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", nameOfPhone='" + nameOfPhone + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
    public String getPhoneToString(){
        return this.id + "," +this.nameOfPhone + "," +this.price + "," +this.quantity + "," +this.manufacturer;
    }
}
