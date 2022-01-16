package bai_tap_lam_them_quan_ly_xe.services;

import bai_tap_lam_them_quan_ly_xe.models.Car;
import bai_tap_lam_them_quan_ly_xe.models.Manufacturer;
import bai_tap_lam_them_quan_ly_xe.models.Motorbike;
import bai_tap_lam_them_quan_ly_xe.models.Truck;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VehiclesManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Truck> truckArrayList = new ArrayList<>();

    static {
        truckArrayList.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        truckArrayList.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        truckArrayList.add(new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
    }

    static ArrayList<Car> carArrayList = new ArrayList<>();

    static {
        carArrayList.add(new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 5, "Du lịch"));
        carArrayList.add(new Car("43B-453.88", "Hyundai", 2020, "Nguyễn Văn B", 45, "Xe khách"));
        carArrayList.add(new Car("43B-453.89", "Ford", 2021, "Nguyễn Văn C", 16, "Xe khách"));
    }

    static ArrayList<Motorbike> motorbikeArrayList = new ArrayList<>();

    static {
        motorbikeArrayList.add(new Motorbike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
        motorbikeArrayList.add(new Motorbike("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150));
        motorbikeArrayList.add(new Motorbike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50));
    }

    static ArrayList<Manufacturer> manufacturerArrayList = new ArrayList<>();

    static {
        manufacturerArrayList.add(new Manufacturer("HSX-001", "Yamaha", "Nhật Bản"));
        manufacturerArrayList.add(new Manufacturer("HSX-002", "Honda", "Nhật Bản"));
        manufacturerArrayList.add(new Manufacturer("HSX-003", "Dongfeng", "Trung Quốc"));
        manufacturerArrayList.add(new Manufacturer("HSX-004", "Hyundai", "Hàn Quốc"));
        manufacturerArrayList.add(new Manufacturer("HSX-005", "Ford", "Mỹ"));
        manufacturerArrayList.add(new Manufacturer("HSX-006", "Toyota", "Nhật Bản"));
        manufacturerArrayList.add(new Manufacturer("HSX-007", "Hino", "Nhật Bản"));
//        Map<Integer,String> manufacturer = new TreeMap<>();
//        manufacturer.put(1,"Yamaha");
//        manufacturer.put(2,"Honda");
//        manufacturer.put(3,"Donfeng");
//        manufacturer.put(4,"Hyundai");
//        manufacturer.put(5,"Ford");
//        manufacturer.put(6,"Toyota");
//        manufacturer.put(7,"Hino");
    }


  
    public static void deleteProduct() {
        System.out.println("Pick a number for vehicle deleting");
        System.out.println("1. Delete a truck");
        System.out.println("2. Delete a car");
        System.out.println("3. Delete a motorbike");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter license plate");
        String deletingLicensePlate = scanner.nextLine().toLowerCase();
        switch (choice) {
            case 1:
                for(Truck truck:truckArrayList){
                    if (truck.getLicensePlate().toLowerCase().equals(deletingLicensePlate)){
                        System.out.println("Pick 1 option 1 or 2");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        int choiceTruck = Integer.parseInt(scanner.nextLine());
                        switch (choiceTruck){
                            case 1:
                                truckArrayList.remove(truck);
                                System.out.println("Deleting successfully");
                                break;
                            case 2:
                                break;
                        }
                    }
                    else {
                        System.out.println("Your input license plate is not exist in truck list");
                        break;
                    }
                }
                break;
            case 2:
                for(Car car:carArrayList){
                    if (car.getLicensePlate().toLowerCase().equals(deletingLicensePlate)){
                        System.out.println("Pick 1 option 1 or 2");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        int choiceCar = Integer.parseInt(scanner.nextLine());
                        switch (choiceCar){
                            case 1:
                                carArrayList.remove(car);
                                System.out.println("Deleting successfully");
                                break;
                            case 2:
                                break;
                        }
                    }
                    else {
                        System.out.println("Your input license plate is not exist in car list");
                        break;
                    }
                }
                break;
            case 3:
                for(Motorbike motorbike:motorbikeArrayList){
                    if (motorbike.getLicensePlate().toLowerCase().equals(deletingLicensePlate)){
                        System.out.println("Pick 1 option 1 or 2");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        int choiceMotorbike = Integer.parseInt(scanner.nextLine());
                        switch (choiceMotorbike){
                            case 1:
                                motorbikeArrayList.remove(motorbike);
                                System.out.println("Deleting successfully");
                                break;
                            case 2:
                                break;
                        }
                    }
                    else {
                        System.out.println("Your input license plate is not exist in motorbike list");
                        break;
                    }
                }
                break;
        }
    }


    public static void editProduct() {
    }

    public static void searchProduct() {
    }

    public static void display() {
        System.out.println("Pick a number for list display");
        System.out.println("1. Display truck list");
        System.out.println("2. Display car list");
        System.out.println("3. Display motorbike list");
        int choice =Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                for(Truck truck:truckArrayList){
                    System.out.println(truck.toString());
                }
                break;
            case 2:
                for(Car car:carArrayList){
                    System.out.println(car.toString());
                }
                break;
            case 3:
                for(Motorbike motorbike:motorbikeArrayList){
                    System.out.println(motorbike.toString());
                }
                break;
        }
    }

    public static void addTruck() {
        System.out.println("Enter new license plate");
        String newLicensePlate = scanner.nextLine();
        for (int i = 0; i < manufacturerArrayList.size(); i++) {
            System.out.println(i + ": " + manufacturerArrayList.get(i).toString());
        }
        System.out.print("Pick a number for manufacturer: ");
        int choice = Integer.parseInt(scanner.nextLine());
        Manufacturer manufacturer = manufacturerArrayList.get(choice);
        String newManufacturer = manufacturer.getManufacturer();
        System.out.println("Enter manufacture year");
        int newManufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter owner name");
        String newOwnerName = scanner.nextLine();
        System.out.println("Enter tonnage");
        int newTonnage = Integer.parseInt(scanner.nextLine());
        truckArrayList.add(new Truck(newLicensePlate, newManufacturer, newManufactureYear, newOwnerName, newTonnage));
    }

    public static void addCar() {
        System.out.println("Enter new license plate");
        String newLicensePlate = scanner.nextLine();
        for (int i = 0; i < manufacturerArrayList.size(); i++) {
            System.out.println((i) + ": " + manufacturerArrayList.get(i).toString());
        }
        System.out.print("Pick a number for manufacturer: ");
        int choice = Integer.parseInt(scanner.nextLine());
        Manufacturer manufacturer = manufacturerArrayList.get(choice);
        String newManufacturer = manufacturer.getManufacturer();
        int newManufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter owner name");
        String newOwnerName = scanner.nextLine();
        System.out.println("Enter number of seat");
        int newNumberOfSeat = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type of car");
        String newTypeofCar = scanner.nextLine();
        carArrayList.add(new Car(newLicensePlate,newManufacturer,newManufactureYear,newOwnerName,newNumberOfSeat,newTypeofCar));
    }

    public static void addMotorbike() {
        System.out.println("Enter new license plate");
        String newLicensePlate = scanner.nextLine();
        for (int i = 0; i < manufacturerArrayList.size(); i++) {
            System.out.println((i) + ": " + manufacturerArrayList.get(i).toString());
        }
        System.out.print("Pick a number for manufacturer: ");
        int choice = Integer.parseInt(scanner.nextLine());
        Manufacturer manufacturer = manufacturerArrayList.get(choice);
        String newManufacturer = manufacturer.getManufacturer();
        int newManufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter owner name");
        String newOwnerName = scanner.nextLine();
        System.out.println("Enter cubic centimeter");
        int newCubicCentimeter = Integer.parseInt(scanner.nextLine());
        motorbikeArrayList.add(new Motorbike(newLicensePlate,newManufacturer,newManufactureYear,newOwnerName,newCubicCentimeter));

    }

    public static void add() {
        int choice1 = -1;
        System.out.print("\t1. Add a new truck\n");
        System.out.print("\t2. Add a new car\n");
        System.out.print("\t3. Add a new motorbike\n");
        System.out.print("Choose 1 option ");
        choice1 = Integer.parseInt(scanner.nextLine());
        switch (choice1) {
            case 1:
                VehiclesManager.addTruck();
                break;
            case 2:
                VehiclesManager.addCar();
                break;
            case 3:
                VehiclesManager.addMotorbike();
                break;
            default:
                System.out.println("Your option is not correct");
        }
    }
}
