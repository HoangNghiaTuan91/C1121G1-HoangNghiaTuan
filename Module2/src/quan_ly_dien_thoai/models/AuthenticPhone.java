package quan_ly_dien_thoai.models;

import java.util.Date;

public class AuthenticPhone extends Phone {
    private Date dateOfWarranty;
    private String warrantyRange;

    public AuthenticPhone() {
    }

    public AuthenticPhone(Date dateOfWarranty, String warrantyRange) {
        this.dateOfWarranty = dateOfWarranty;
        this.warrantyRange = warrantyRange;
    }

    public AuthenticPhone(String id, String nameOfPhone, double price, int quantity, String manufacturer, Date dateOfWarranty, String warrantyRange) {
        super(id, nameOfPhone, price, quantity, manufacturer);
        this.dateOfWarranty = dateOfWarranty;
        this.warrantyRange = warrantyRange;
    }

    public Date getDateOfWarranty() {
        return dateOfWarranty;
    }

    public void setDateOfWarranty(Date dateOfWarranty) {
        this.dateOfWarranty = dateOfWarranty;
    }

    public String getWarrantyRange() {
        return warrantyRange;
    }

    public void setWarrantyRange(String warrantyRange) {
        this.warrantyRange = warrantyRange;
    }

    @Override
    public String toString() {
        return "AuthenticPhone{" +
                "dateOfWarranty=" + dateOfWarranty +
                ", warrantyRange='" + warrantyRange + '\'' +
                '}';
    }

    public String getAuthenticPhoneToString() {
        return super.getPhoneToString() + "," + this.dateOfWarranty + "," + this.warrantyRange;
    }
}
