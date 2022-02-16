package case_study.service.implement;

import case_study.models.*;
import case_study.service.IBooking;
import case_study.service.IFacility;
import case_study.utils.ReadAndWrite;
import case_study.models.Booking;
import case_study.utils.Validate;

import java.util.*;

public class BookingServiceImplement implements IBooking {
    String customerFilePath = "src\\case_study\\data\\customer.csv";
    static String villaFilePath = "src\\case_study\\data\\villa.csv";
    static String houseFilePath = "src\\case_study\\data\\house.csv";
    static String roomFilePath = "src\\case_study\\data\\room.csv";
    static String bookingQueueFilePath = "src\\case_study\\data\\bookingqueueforcontract.csv";
    static String bookingFilePath = "src\\case_study\\data\\booking.csv";
    IFacility iFacility = new FacilityServiceImplement();


    @Override
    public void add() {
        TreeSet<Booking> bookingTreeSet = ReadAndWrite.getBookingTreeSet(bookingFilePath);
//        Queue<Booking> bookingQueue = ReadAndWrite.getBookingQueue(bookingQueueFilePath);
        String iDNameOfService = iDNameOfService();
        String customerCode = customerCodeList();
        Scanner sc = new Scanner(System.in);

            String bookingId = "";
            boolean flag = true;
            try {
                while (flag) {
                    System.out.println("Enter Booking's ID");
                    bookingId = sc.nextLine();
                    flag = false;
                    for (Booking booking : bookingTreeSet) {
                        if (booking.getIdBooking().equals(bookingId)) {
                            System.out.println("The booking iD is exist! \n Please enter again");
                            flag = true;
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        try {
            System.out.println("Enter Booking's starting day: ");
            String bookingStart;
            boolean isValidOfBookingStartDay;
            do {
                System.out.print("Please enter starting day (dd/mm/yyyy): ");
                bookingStart = sc.nextLine();
                isValidOfBookingStartDay = Validate.validateDateFormat(bookingStart);
                if (!isValidOfBookingStartDay) {
                    System.out.println("The starting day must be in the correct format: dd/mm/yyyy");
                }
            } while (!isValidOfBookingStartDay);

            System.out.println("Enter Booking's day end: ");
            String bookingEnd;
            boolean isValidOfBookingEndDay;
            do {
                System.out.print("Please enter ending day (dd/mm/yyyy): ");
                bookingEnd = sc.nextLine();
                isValidOfBookingEndDay = Validate.validateDateFormat(bookingEnd);
                if (!isValidOfBookingEndDay) {
                    System.out.println("The ending day must be in the correct format: dd/mm/yyyy");
                }
            } while (!isValidOfBookingEndDay);

            System.out.println("Enter Booking's type of service: ");
            String bookingTypeService = chooseTypeOfService();
            Booking booking = new Booking(bookingId, bookingStart, bookingEnd, customerCode, iDNameOfService, bookingTypeService);
            bookingTreeSet.add(booking);
//            bookingQueue.add(booking);
            ReadAndWrite.WriteBookingTreeSetToCSV(bookingTreeSet, bookingFilePath, false);
            iFacility.addTimesOfUsing(iDNameOfService);
            ReadAndWrite.WriteBookingTreeSetToCSV(bookingTreeSet, bookingQueueFilePath, false);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        TreeSet<Booking> bookingTreeSet = ReadAndWrite.getBookingTreeSet(bookingFilePath);
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void edit() {
    }

    public String iDNameOfService() {
        Scanner sc = new Scanner(System.in);
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        Set<Villa> villaSet = villaMap.keySet();
        Set<House> houseSet = houseMap.keySet();
        Set<Room> roomSet = roomMap.keySet();
        List<String> IdOfService = new ArrayList<>();
        System.out.println("List of villa's name service: ");
        for (Villa villaKey : villaSet) {
            System.out.println(villaKey.getIdNameOfService());
            IdOfService.add(villaKey.getIdNameOfService());
        }
        System.out.println("List of house's name service: ");
        for (House houseKey : houseSet) {
            System.out.println(houseKey.getIdNameOfService());
            IdOfService.add(houseKey.getIdNameOfService());
        }
        System.out.println("List of room's name service: ");
        for (Room roomKey : roomSet) {
            System.out.println(roomKey.getIdNameOfService());
            IdOfService.add(roomKey.getIdNameOfService());
        }
        boolean flag = true;
        boolean check = true;
        String inputIdNameOfService = "";
        try {
            while (flag) {
                System.out.println("Please enter name of service: ");
                inputIdNameOfService = sc.nextLine();
                for (String string : IdOfService) {
                    if (string.equals(inputIdNameOfService)) {
                        flag = false;
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("Cannot find name of service! Please enter again");
                }
            }
            return inputIdNameOfService;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputIdNameOfService;
    }

    public String customerCodeList() {
        Scanner sc = new Scanner(System.in);
        List<Customer> customerList = ReadAndWrite.getListCustomer(customerFilePath);
        System.out.println("List of customer's code: ");
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerCode());
        }
        boolean flag = true;
        boolean check = true;
        String inputCustomerCode = "";
        try {
            while (flag) {
                System.out.println("Please enter customer's code: ");
                inputCustomerCode = sc.nextLine();
                for (Customer customer : customerList) {
                    if (customer.getCustomerCode().equals(inputCustomerCode)) {
                        flag = false;
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("Cannot find customer's code! Please enter again");
                }
            }
            return inputCustomerCode;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputCustomerCode;
    }

    private String chooseTypeOfService() {
        String serviceType = "";
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose type of service: "
                    + "1.Villa \n"
                    + "2.House \n"
                    + "3.Room \n"
            );
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    serviceType = "Villa";
                    break;
                case "2":
                    serviceType = "House";
                    break;
                case "3":
                    serviceType = "Room";
                    break;
                default:
                    System.out.println("Please enter again!");
                    break;
            }
            return serviceType;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        return serviceType;
    }

}
