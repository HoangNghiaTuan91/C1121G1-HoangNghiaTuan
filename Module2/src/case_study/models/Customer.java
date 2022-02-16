package case_study.models;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerCode;
    private String typeOfCustomer;
    private String address;

    public Customer(String fullName, String dayOfBirth, String id, String gender, String phoneNumber, String email, String customerCode, String typeOfCustomer, String address) {
        super(fullName, dayOfBirth, id, gender, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String customerCode, String typeOfCustomer, String address) {
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Customer(){}

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}' + super.toString();
    }

    public String getCustomerString() {
        return super.getString() + "," + getCustomerCode() + "," + getTypeOfCustomer() + "," + getAddress();
    }
}
