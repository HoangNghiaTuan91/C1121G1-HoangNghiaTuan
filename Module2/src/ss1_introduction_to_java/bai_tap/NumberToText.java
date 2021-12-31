package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToText {
    public static String read1DigitNumber(int number) {
        String str = "";
        switch (number) {
            case 0:
                str = "";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }

    public static String read2DigitNumber(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        String str = "";
        switch (num1) {
            case 1:
                switch (num2) {
                    case 0:
                        str = "ten";
                        break;
                    case 1:
                        str = "eleven";
                        break;
                    case 2:
                        str = "twelve";
                        break;
                    case 3:
                        str = "thirteen";
                        break;
                    case 5:
                        str = "fifteen";
                        break;
                    case 8:
                        str = "eighteen";
                        break;
                    default:
                        str = read1DigitNumber(num2) + "teen";
                        break;
                }
                break;
            case 2:
                str = "twenty " + read1DigitNumber(num2);
                break;
            case 3:
                str = "thirty " + read1DigitNumber(num2);
                break;
            case 4:
                str = "forty " + read1DigitNumber(num2);
                break;
            case 5:
                str = "fifty " + read1DigitNumber(num2);
                break;
            case 8:
                str = "eighty " + read1DigitNumber(num2);
                break;
            default:
                str = read1DigitNumber(num1) + "ty " + read1DigitNumber(num2);
                break;
        }
        return str;
    }

    public static String read3DigitNumber(int number) {
        int num1 = number / 100;
        int num2 = number % 100;
        String str = "";
        if (num2 == 0 && num1 > 0) {
            str = read1DigitNumber(num1) + "hundred";
        }
        if (num1 > 0 && num2 <= 9 && num2 > 0) {
            str =read1DigitNumber(num1)+ "hundred and " + read1DigitNumber(num2);
        }
        if (num1 > 0 && num2 >= 10 && num2 <= 99) {
            str = read1DigitNumber(num1) + "hundred and " + read2DigitNumber(num2);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số nguyên không âm");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.print("Bạn đã nhập vào 1 số nhỏ hơn 0 nên không chuyển đổi được");
        } else if (inputNumber == 0) {
            System.out.print("Số sau chuyển đổi là Zero");
        } else if (inputNumber <= 9) {
            System.out.print("Số sau chuyển đổi là: " + read1DigitNumber(inputNumber));
        } else if (inputNumber <= 99) {
            System.out.print("Số sau chuyển đổi là: " + read2DigitNumber(inputNumber));
        } else if (inputNumber <= 999) {
            System.out.print("Số sau chuyển đổi là: " + read3DigitNumber(inputNumber));
        } else {
            System.out.print("Trình em đến đây thôi,đại ca nhập số lớn quá em không chuyển nổi");
        }
    }
}
