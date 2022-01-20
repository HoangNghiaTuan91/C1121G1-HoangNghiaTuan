package ss15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            double side1OfTriangle;
            System.out.println("nhập độ dài cạnh 1 của tam giác");
            side1OfTriangle = Double.parseDouble(scanner.nextLine());
            double side2OfTriangle;
            System.out.println("nhập độ dài cạnh 2 của tam giác");
            side2OfTriangle = Double.parseDouble(scanner.nextLine());
            double side3OfTriangle;
            System.out.println("nhập độ dài cạnh 3 của tam giác");
            side3OfTriangle = Double.parseDouble(scanner.nextLine());
            try {
                new Triangle(side1OfTriangle, side2OfTriangle, side3OfTriangle);
                System.out.println("đây là tam giác");
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
