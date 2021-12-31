package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class ShapeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the square triangle bottom-left");
            System.out.println("2. Draw the square triangle bottom-right");
            System.out.println("3. Draw the square triangle top-left");
            System.out.println("4. Draw the square triangle top-right");
            System.out.println("5. Draw the  isosceles triangle");
            System.out.println("6. Draw the rectangle");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the square triangle bottom-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle bottom-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int l = 0; l <= i; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the square triangle top-left");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Draw the square triangle top-right");
                    for (int i = 5; i > 0; i--) {
                        for (int l = 5; l > i; l--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Draw the  isosceles triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int l = 1; l <= 2 * i - 1; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 15; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
