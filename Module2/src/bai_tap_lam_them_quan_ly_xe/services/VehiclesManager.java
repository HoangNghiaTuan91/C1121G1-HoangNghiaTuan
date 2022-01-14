package bai_tap_lam_them_quan_ly_xe.services;

import bai_tap_lam_them_quan_ly_xe.models.Car;
import bai_tap_lam_them_quan_ly_xe.models.Manufacturer;
import bai_tap_lam_them_quan_ly_xe.models.Motorbike;
import bai_tap_lam_them_quan_ly_xe.models.Truck;

import java.util.ArrayList;
import java.util.Scanner;

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
        manufacturerArrayList.add(new Manufacturer("HSX-004", "Huyndai", "Hàn Quốc"));
        manufacturerArrayList.add(new Manufacturer("HSX-005", "Ford", "Mỹ"));
        manufacturerArrayList.add(new Manufacturer("HSX-006", "Toyota", "Nhật Bản"));
        manufacturerArrayList.add(new Manufacturer("HSX-007", "Hino", "Nhật Bản"));
    }

    public static void addProduct() {
    }

    public static void deleteProduct() {
    }

    public static void editProduct() {
    }

    public static void searchProduct() {
    }

    public static void display() {
    }
}
