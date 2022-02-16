package case_study.service.implement;

import case_study.models.Customer;
import case_study.service.ICustomer;
import case_study.utils.DateFormatException;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImplement implements ICustomer {
    String customerFilePath = "src\\case_study\\data\\customer.csv";
    Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();

    @Override
    public void add() {
        List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
        boolean flag = true;
        String customerCode = "";
        try {
            while (flag) {
                System.out.println("Enter customer's code: ");
                customerCode = sc.nextLine();
                flag = false;
                for (int i = 0; i < customerList.size(); i++) {
                    if (customerList.get(i).getCustomerCode().equals(customerCode)) {
                        System.out.println("Customer code is exist! \n Enter again: ");
                        flag = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Enter customer's full name: ");
            String fullName = sc.nextLine();
            System.out.println("Enter customer's birthday: ");
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
            System.out.println("Enter customer's id card: ");
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
            System.out.println("Enter customer's gender: \n 1. Male \n 2. Female \n 3. Other");
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
            System.out.println("Enter customer's phone number: ");
            String phoneNumber = sc.nextLine();
            System.out.println("Enter customer's email: ");
            String email = sc.nextLine();
            System.out.println("Enter customer's class: \n 1. Diamond \n 2. Platinum \n 3. Gold \n 4. Silver \n 5. Member ");
            int choiceOfClass = Integer.parseInt(sc.nextLine());
            String customerClass = "";
            switch (choiceOfClass) {
                case 1:
                    customerClass = "Diamond";
                    break;
                case 2:
                    customerClass = "Platinum";
                    break;
                case 3:
                    customerClass = "Gold";
                    break;
                case 4:
                    customerClass = "Silver";
                    break;
                case 5:
                    customerClass = "Member";
                    break;
            }
            System.out.println("Enter customer's address: ");
            String customerAddress = sc.nextLine();
            customerList.add(new Customer(fullName, dayOfBirth, idCard, gender, phoneNumber, email, customerCode, customerClass, customerAddress));
            System.out.println("Add customer successfully!");
            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
            display();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i) != null) {
                System.out.println(i + 1 + ". " + customerList.get(i).toString());
            }
        }
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        display();
        try {
            List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
            System.out.println("Please enter customer code to edit: ");
            String customerCodeEdit = sc.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCustomerCode().equals(customerCodeEdit)) {
                    System.out.println("Please choose one of these options: \n 1. Edit customer's full name \n 2. Edit customer's birthday \n 3. Edit customer's ID card \n 4. Edit customer's gender \n 5. Edit customer's phone number \n 6. Edit customer's email \n 7. Edit customer's type \n 8. Edit customer's address \n 0. Return");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new full name: ");
                            String newFullName = sc.nextLine();
                            customerList.get(i).setFullName(newFullName);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 2:
                            System.out.println("Enter new birthday: ");
                            String newDayOfBirth;
                            boolean isValidOfBirthday;
                            boolean flagBirthday;
                            do {
                                System.out.print("Please enter birthday (dd/mm/yyyy): ");
                                newDayOfBirth = sc.nextLine();
                                isValidOfBirthday = Validate.validateDateFormat(newDayOfBirth);
                                if (!isValidOfBirthday) {
                                    System.out.println("The birthday must be in the correct format: dd/mm/yyyy");
                                }
                                flagBirthday = isValidOfBirthday && invalidOfBirthday(newDayOfBirth);
                            } while (!flagBirthday);
                            customerList.get(i).setDayOfBirth(newDayOfBirth);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 3:
                            System.out.println("Enter new ID card: ");
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
                            customerList.get(i).setId(newIdCard);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 4:
                            System.out.println("Choose one of these options: \n 1. Male \n 2. Female \n 3. Other ");
                            int choiceOfGender = Integer.parseInt(sc.nextLine());
                            String newGender = "";
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
                            }
                            customerList.get(i).setGender(newGender);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 5:
                            System.out.println("Enter new phone number: ");
                            String newPhoneNumber = sc.nextLine();
                            customerList.get(i).setPhoneNumber(newPhoneNumber);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 6:
                            System.out.println("Enter new email: ");
                            String newEmail = sc.nextLine();
                            customerList.get(i).setEmail(newEmail);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 7:
                            System.out.println("Enter customer's class: \n 1. Diamond \n 2. Platinum \n 3. Gold \n 4. Silver \n 5. Member ");
                            int choiceOfClass = Integer.parseInt(sc.nextLine());
                            String customerClass = "";
                            switch (choiceOfClass) {
                                case 1:
                                    customerClass = "Diamond";
                                    break;
                                case 2:
                                    customerClass = "Platinum";
                                    break;
                                case 3:
                                    customerClass = "Gold";
                                    break;
                                case 4:
                                    customerClass = "Silver";
                                    break;
                                case 5:
                                    customerClass = "Member";
                                    break;
                            }
                            customerList.get(i).setTypeOfCustomer(customerClass);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 8:
                            System.out.println("Enter new address: ");
                            String newAddress = sc.nextLine();
                            customerList.get(i).setAddress(newAddress);
                            ReadAndWrite.WriteStringCustomerToCSV(customerList, customerFilePath, false);
                            break;
                        case 0:
                            break;

                    }
                    System.out.println("List after updated: ");
                    display();
                } else {
                    System.out.println("Cannot find the customer's code for editing! \n Please enter again ");
                }
            }

        } catch (NumberFormatException e) {
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
