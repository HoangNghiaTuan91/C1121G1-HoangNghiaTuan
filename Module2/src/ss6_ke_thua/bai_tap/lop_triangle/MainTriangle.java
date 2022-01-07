package ss6_ke_thua.bai_tap.lop_triangle;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh 1");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh 2");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh 3");
        double side3 = Double.parseDouble(scanner.nextLine());
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("Nhập màu sắc của tam giác");
            String color = scanner.nextLine();
            Triangle triangle = new Triangle(color,side1,side2,side3);
            System.out.println(triangle.toString());
        } else {
            System.out.println("đây không phải là 1 tam giác");
        }
    }
}
