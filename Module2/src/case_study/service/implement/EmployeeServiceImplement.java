package case_study.service.implement;

import case_study.models.Employee;
import case_study.service.IEmployee;
import case_study.utils.DateFormatException;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImplement implements IEmployee {
    String employeeFilePath = "src\\case_study\\data\\employee.csv";
    List<Employee> employeeList = ReadAndWrite.getListEmployee(employeeFilePath);
    Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();

    @Override
    public void add() {
        boolean flagId = true;
        String idEmployee = "";
        try {
            while (flagId) {
                System.out.println("Enter employee's ID: ");
                idEmployee = sc.nextLine();
                flagId = false;
                for (Employee employee : employeeList) {
                    if (employee.getIdEmployee().equals(idEmployee)) {
                        System.out.println("Employee ID is exist! \n Enter again: ");
                        flagId = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Enter employee's full name: ");
            String fullName = sc.nextLine();
            System.out.println("Enter employee's birthday: ");
            String dayOfBirth;
            boolean isValidOfBirthday;
            boolean flagBirthday;
            do {
                System.out.print("Please enter birthday (dd/mm/yyyy): ");
                dayOfBirth = sc.nextLine();
                isValidOfBirthday = Validate.validateDateFormat(dayOfBirth);
                if (!isValidOfBirthday) {
                    System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
                }
                flagBirthday = isValidOfBirthday && invalidOfBirthday(dayOfBirth);
            } while (!flagBirthday);
            System.out.println("Enter employee's id card: ");
            String idCard = null;
            boolean isValidOfIdCardNumber;
            do {
                isValidOfIdCardNumber = true;
                try {
                    System.out.print("Please enter Id card number: ");
                    idCard = sc.nextLine();
                    isValidOfIdCardNumber = Validate.validateIdCard(idCard);
                    if (!isValidOfIdCardNumber) {
                        throw new Exception("Error. The Id card number must be in the correct format");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (!isValidOfIdCardNumber);

            System.out.println("Enter employee's gender: \n 1. Male \n 2. Female \n 3. Other");
            int choiceOfGender = Integer.parseInt(sc.nextLine());
            String gender = "";
            switch (choiceOfGender) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                case 3:
                    gender = "Other";
                    break;
            }
            System.out.println("Enter employee's phone number: ");
            String phoneNumber = sc.nextLine();
            System.out.println("Enter employee's email: ");
            String emailOfEmployee = sc.nextLine();
            System.out.println("Enter employee's qualification: \n 1. Intermediate \n 2. College \n 3. University \n 4. Postgraduate");
            int choiceOfQualification = Integer.parseInt(sc.nextLine());
            String qualification = "";
            switch (choiceOfQualification) {
                case 1:
                    qualification = "Intermediate";
                    break;
                case 2:
                    qualification = "College";
                    break;
                case 3:
                    qualification = "University";
                    break;
                case 4:
                    qualification = "Postgraduate";
                    break;
            }
            System.out.println("Enter employee's title of position: \n 1. Receptionist \n 2. Waiter \n 3. Expert \n 4. Supervisor \n 5. Manager \n 6. Director");
            int choiceOfTitle = Integer.parseInt(sc.nextLine());
            String titlePosition = "";
            switch (choiceOfTitle) {
                case 1:
                    titlePosition = "Receptionist";
                    break;
                case 2:
                    titlePosition = "Waiter";
                    break;
                case 3:
                    titlePosition = "Expert";
                    break;
                case 4:
                    titlePosition = "Supervisor";
                    break;
                case 5:
                    titlePosition = "Manager";
                    break;
                case 6:
                    titlePosition = "Director";
                    break;
            }
            System.out.println("Enter employee's salary: ");
            double salary = Double.parseDouble(sc.nextLine());
            employeeList.add(new Employee(fullName, dayOfBirth, idCard, gender, phoneNumber, emailOfEmployee, idEmployee, qualification, titlePosition, salary));
            System.out.println("Add employee successfully");
            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
            display();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) != null) {
                System.out.println(i + 1 + ". " + employeeList.get(i).toString());
            }
        }
    }

    @Override
    public void edit() {
        display();
        try {
            System.out.println("Please enter ID of employee to edit: ");
            String idEmployeeEdit = sc.nextLine();
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getIdEmployee().equals(idEmployeeEdit)) {
                    System.out.println("Please choose one of these options: \n 1. Edit employee's full name. \n 2. Edit employee's day of birth. \n 3. Edit employee's gender. \n 4. Edit employee's ID card. \n 5. Edit employee's phone number \n 6. Edit employee's email \n 7. Edit employee's level of education \n 8. Edit employee's position \n 0. Return  ");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new full name: ");
                            String newFullName = sc.nextLine();
                            employeeList.get(i).setFullName(newFullName);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 2:
                            String newDayOfBirth;
                            boolean isValidOfBirthday;
                            boolean flag;
                            do {
                                System.out.print("Please enter birthday (dd/mm/yyyy): ");
                                newDayOfBirth = sc.nextLine();
                                isValidOfBirthday = Validate.validateDateFormat(newDayOfBirth);
                                if (!isValidOfBirthday) {
                                    System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
                                }
                                flag = isValidOfBirthday && invalidOfBirthday(newDayOfBirth);
                            } while (!flag);

                            employeeList.get(i).setDayOfBirth(newDayOfBirth);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 3:
                            System.out.println("Please choose one of these options: \n 1. Male \n 2. Female \n 3. Other");
                            String newGender = "";
                            int choiceOfGender = Integer.parseInt(sc.nextLine());
                            switch (choiceOfGender) {
                                case 1:
                                    newGender = "Male";
                                    break;
                                case 2:
                                    newGender = "Female";
                                    break;
                                case 3:
                                    newGender = "Other";
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + choiceOfGender);
                            }
                            employeeList.get(i).setGender(newGender);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 4:
                            System.out.println("Enter new id card: ");
                            String newIdCard = null;
                            boolean isValidOfIdCardNumber;
                            do {
                                isValidOfIdCardNumber = true;
                                try {
                                    System.out.print("Please enter Id card number: ");
                                    newIdCard = sc.nextLine();
                                    isValidOfIdCardNumber = Validate.validateIdCard(newIdCard);
                                    if (!isValidOfIdCardNumber) {
                                        throw new Exception("Error. The Id card number must be in the correct format");
                                    }
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            } while (!isValidOfIdCardNumber);
                            employeeList.get(i).setId(newIdCard);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 5:
                            System.out.println("Enter new phone number: ");
                            String newPhoneNumber = sc.nextLine();
                            employeeList.get(i).setPhoneNumber(newPhoneNumber);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 6:
                            System.out.println("Enter new email: ");
                            String newEmail = sc.nextLine();
                            employeeList.get(i).setEmail(newEmail);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 7:
                            System.out.println("Enter employee's qualification: \n 1. Intermediate \n 2. College \n 3. University \n 4. Postgraduate");
                            int choiceOfQualification = Integer.parseInt(sc.nextLine());
                            String newQualification = "";
                            switch (choiceOfQualification) {
                                case 1:
                                    newQualification = "Intermediate";
                                    break;
                                case 2:
                                    newQualification = "College";
                                    break;
                                case 3:
                                    newQualification = "University";
                                    break;
                                case 4:
                                    newQualification = "Postgraduate";
                                    break;
                            }
                            employeeList.get(i).setQualification(newQualification);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 8:
                            System.out.println("Enter employee's title of position: \n 1. Receptionist \n 2. Waiter \n 3. Expert \n 4. Supervisor \n 5. Manager \n 6. Director");
                            int choiceOfTitle = Integer.parseInt(sc.nextLine());
                            String newTitlePosition = "";
                            switch (choiceOfTitle) {
                                case 1:
                                    newTitlePosition = "Receptionist";
                                    break;
                                case 2:
                                    newTitlePosition = "Waiter";
                                    break;
                                case 3:
                                    newTitlePosition = "Expert";
                                    break;
                                case 4:
                                    newTitlePosition = "Supervisor";
                                    break;
                                case 5:
                                    newTitlePosition = "Manager";
                                    break;
                                case 6:
                                    newTitlePosition = "Director";
                                    break;
                            }
                            employeeList.get(i).setTitleOfPosition(newTitlePosition);
                            ReadAndWrite.WriteStringEmployeeToCSV(employeeList, employeeFilePath, false);
                            break;
                        case 0:
                            break;

                    }
                }
            }
        } catch (NumberFormatException | IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public boolean invalidOfBirthday(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar now = Calendar.getInstance();
        Calendar born = Calendar.getInstance();
        try {
            now.setTime(new Date());
            born.setTime(simpleDateFormat.parse(string));
            int age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
            if (age < 18 || age > 100) {
                throw new DateFormatException("Exception: Birthday is invalid");
            }
            return true;
        } catch (DateFormatException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
}
