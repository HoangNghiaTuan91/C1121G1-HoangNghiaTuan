package ss7_abstract_class_interface.bai_tap.interface_resizable_cho_cac_lop_hinh_hoc;

import java.util.Random;
import java.util.Scanner;

public class ResizableTestMain {
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
        Random b= new Random();
        double random1 = b.nextDouble();
        System.out.println("Nhập số hình bạn muốn tạo");
        int size = Integer.parseInt(scanner.nextLine());
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = (Shape) getRandomShape();
        }
        System.out.println("trước khi thay đổi kích thước");
        for (Shape shape:shapes) {
            if (shape instanceof Circle){
                System.out.println("diện tích hình tròn trước thay đổi "+(1+random1)*100+" % là "+((Circle) shape).getArea());
                ((Circle) shape).resize(random1);
                System.out.println("diện tích hình tròn sau thay đổi "+(1+random1)*100+" % là "+((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle){
                System.out.println("diện tích hình chữ nhật trước thay đổi "+(1+random1)*100+" % là "+((Rectangle) shape).getArea());
                ((Rectangle) shape).resize(random1);
                System.out.println("diện tích hình chữ nhật sau thay đổi "+(1+random1)*100+" % là "+((Rectangle) shape).getArea());
            }
            if (shape instanceof Square){
                System.out.println("diện tích hình vuông trước thay đổi "+(1+random1)*100+" % là "+((Square) shape).getArea());
                ((Square) shape).resize(random1);
                System.out.println("diện tích hình vuông sau thay đổi "+(1+random1)*100+" % là "+((Square) shape).getArea());
            }
        }

    }

}
