package ss7_abstract_class_interface.interface_colorable_cho_cac_lop_hinh_hoc;

import java.util.Random;
import java.util.Scanner;

public class ColorableTestMain {
    public static Object getRandomShape() {
        Random a = new Random();
        int random = a.nextInt(3);
        switch (random) {
            case 0:
                return new Circle(5.5);
            case 1:
                return new Rectangle(3.3, 4.4);
            case 2:
                return new Square(6.6);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hình bạn muốn tạo");
        int size = Integer.parseInt(scanner.nextLine());
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = (Shape) getRandomShape();
        }
        System.out.println("trước khi thay đổi kích thước");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Hình tròn có diện tích là: "+ ((Circle)shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Hình tròn có diện tích là: "+ ((Rectangle)shape).getArea());
            }
            if (shape instanceof Square) {
                ((Square)shape).howToColor();
            }
        }

    }

}
