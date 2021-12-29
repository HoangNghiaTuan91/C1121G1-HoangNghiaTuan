package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập vào số cần chuyển sang chữ: ");
        number = scanner.nextInt();

        if (number > 0 && number < 10){
            switch (number){
                case 1:System.out.print("One");
                break;
                case 2:System.out.print("Two");
                break;
                case 3:System.out.print("Three");
                break;
                case 4:System.out.print("Four");
                break;
                case 5:System.out.print("Five");
                break;
                case 6:System.out.print("Six");
                break;
                case 7:System.out.print("Seven");
                break;
                case 8:System.out.print("Eight");
                break;
                case 9:System.out.print("Nine");
                break;
            }
        }
        if(number>=10&&number<20){
            if(number==10){
                System.out.print("Ten");
            } else if(number==11){
                System.out.print("Eleven");
            } else if(number==12){
                System.out.print("Twelve");
            } else if(number==13){
                System.out.print("Thirteenth");
            }
            else {
                switch (number){
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        System.out.print();
                }
            }
        }
    }
}
