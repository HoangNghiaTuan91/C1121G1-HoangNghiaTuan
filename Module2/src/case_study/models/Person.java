package case_study.models;

import java.time.LocalDate;

public abstract class Person {
    private String fullName;
    private String dayOfBirth;
    private String id;
    private String gender;
    private String phoneNumber;
    private String email;

    public Person(String fullName, String dayOfBirth, String id, String gender, String phoneNumber, String email) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.id = id;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Person(){}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public String getString() {
        return getFullName() + "," + getDayOfBirth() + "," + getId() + "," + getGender() + "," + getPhoneNumber() + "," + getEmail();
    }
}
