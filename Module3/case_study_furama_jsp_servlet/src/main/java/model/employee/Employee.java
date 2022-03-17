package model.employee;

import model.Person;
import model.User;

public class Employee extends Person {
    private Double employeeSalary;
    private Position positionId;
    private EducationDegree educationDegreeId;
    private Division divisionId;
    private User userName;

    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, String idCard, String phone, String email, String address, Double employeeSalary, Position positionId, EducationDegree educationDegreeId, Division divisionId, User userName) {
        super(id, name, birthday, idCard, phone, email, address);
        this.employeeSalary = employeeSalary;
        this.positionId = positionId;
        this.educationDegreeId = educationDegreeId;
        this.divisionId = divisionId;
        this.userName = userName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(EducationDegree educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division divisionId) {
        this.divisionId = divisionId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }
}
