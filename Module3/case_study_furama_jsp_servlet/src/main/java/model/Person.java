package model;

public abstract class Person {
    private Integer id;
    private String name;
    private String birthday;
    private String idCard;
    private String phone;
    private String email;
    private String address;

    public Person() {
    }

    public Person(Integer id, String name, String birthday, String idCard, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
