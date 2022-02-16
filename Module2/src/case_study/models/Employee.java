package case_study.models;

public class Employee extends Person {
    private String idEmployee;
    private String qualification;
    private String titleOfPosition;
    private double salary;

    public Employee(String fullName, String dayOfBirth, String id, String gender, String phoneNumber, String email, String idEmployee, String qualification, String titleOfPosition, double salary) {
        super(fullName, dayOfBirth, id, gender, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.qualification = qualification;
        this.titleOfPosition = titleOfPosition;
        this.salary = salary;
    }

    public Employee(String idEmployee, String qualification, String titleOfPosition, double salary) {
        this.idEmployee = idEmployee;
        this.qualification = qualification;
        this.titleOfPosition = titleOfPosition;
        this.salary = salary;
    }
    public Employee(){}

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getTitleOfPosition() {
        return titleOfPosition;
    }

    public void setTitleOfPosition(String titleOfPosition) {
        this.titleOfPosition = titleOfPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", levelOfEducation='" + qualification + '\'' +
                ", titleOfPosition='" + titleOfPosition + '\'' +
                ", salary=" + salary +
                '}' + super.toString();
    }
     public String getString() {
        return super.getString()+","+getIdEmployee()+","+ getQualification()+","+getTitleOfPosition()+","+getSalary();
     }
}
