package case_study.service.implement;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.service.IContract;
import case_study.utils.ReadAndWrite;

import java.util.*;

public class ContractServiceImplement implements IContract {
    static String bookingQueueFilePath = "src\\case_study\\data\\bookingqueueforcontract.csv";
    static String contractListPath = "src\\case_study\\data\\contract.csv";

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        Set<Booking> bookingSet = ReadAndWrite.getBookingTreeSet(bookingQueueFilePath);
        Queue<Booking> bookingQueue = new LinkedList<>();
        for (Booking booking : bookingSet) {
            if (booking.getTypeOfService().equals("Villa") || booking.getTypeOfService().equals("House")) {
                bookingQueue.add(booking);
            }
        }
        List<Contract> contractList = ReadAndWrite.getContractList(contractListPath);
        Booking booking = bookingQueue.remove();
        System.out.println("This is the first contract: " + bookingQueue.peek());
        String bookingID = booking.getIdBooking();
        String customerID = booking.getIdCustomer();

//        ReadAndWrite.WriteBookingTreeSetToQueue(bookingQueue, bookingQueueFilePath, false);
        String contractId = "";
        boolean flag = true;
        try {
            while (flag) {
                System.out.println("Enter contract's ID");
                contractId = sc.nextLine();
                flag = false;
                for (Contract contract : contractList) {
                    if (contract.getIdContract().equals(contractId)) {
                        System.out.println("This contract iD is exist! \n Please enter again");
                        flag = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Enter amount of deposit: ");
            double amountOfDeposit = Double.parseDouble(sc.nextLine());
            System.out.println("Enter total pay: ");
            double totalPay = Double.parseDouble(sc.nextLine());
            Contract contract = new Contract(contractId, bookingID, amountOfDeposit, totalPay, customerID);
            contractList.add(contract);
            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, true);
            display();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void edit() {

    }


    @Override
    public void display() {
        List<Contract> contractList = ReadAndWrite.getContractList(contractListPath);
        for (int i = 0; i < contractList.size(); i++) {
            System.out.println(i + 1 + "." + contractList.get(i));
        }
    }
//
//    @Override
//    public void edit() {
//        List<Contract> contractList = ReadAndWrite.getContractList(contractListPath);
//        Scanner sc = new Scanner(System.in);
//        display();
//        try {
//            System.out.println("Please enter contract's ID to edit: ");
//            String contractIDEdit = sc.nextLine();
//            for (int i = 0; i < contractList.size(); i++) {
//                if (contractList.get(i).getIdContract().equals(contractIDEdit)) {
//                    System.out.println("Please choose one of these options: \n 1. Edit amount of deposit \n 2. Edit total pay \n 3. Edit customer's ID \n 0. Return");
//                    int choice = Integer.parseInt(sc.nextLine());
//                    switch (choice) {
//                        case 1:
//                            System.out.println("Enter new amount of deposit: ");
//                            double amountOfDeposit = Double.parseDouble(sc.nextLine());
//                            contractList.get(i).setAmountOfDeposit(amountOfDeposit);
//                            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, false);
//                            break;
//                        case 2:
//                            System.out.println("Enter new total pay: ");
//                            double totalPay = Double.parseDouble(sc.nextLine());
//                            contractList.get(i).setTotalPay(totalPay);
//                            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, false);
//                            break;
//                        case 3:
//                            System.out.println("Enter new customer's ID: ");
//                            String customerID = sc.nextLine();
//                            contractList.get(i).setIdCustomer(customerID);
//                            ReadAndWrite.WriteContractStringToCSV(contractList, contractListPath, false);
//                            break;
//                        case 0:
//                            break;
//
//                    }
//                    System.out.println("List after updated: ");
//                    display();
//                } else {
//                    System.out.println("Cannot find the customer's code for editing! \n Please enter again ");
//                }
//            }
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }
//    }
}

