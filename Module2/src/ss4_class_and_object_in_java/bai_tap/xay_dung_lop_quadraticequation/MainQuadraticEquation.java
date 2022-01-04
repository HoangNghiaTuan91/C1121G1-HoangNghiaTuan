package ss4_class_and_object_in_java.bai_tap.xay_dung_lop_quadraticequation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.getResult();
    }
}
