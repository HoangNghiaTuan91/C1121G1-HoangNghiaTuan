package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class AppearanceOfAnElementInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 chuỗi kí tự");
        String str = scanner.nextLine();
        System.out.println("Hãy nhập vào 1 kí tự");
        String character = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character.charAt(0)) {
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy ký tự " + character + " ở trong chuỗi ban đầu");
        } else {
            System.out.println("Có " + count + " ký tự " + character + " ở trong chuỗi ban đầu");
        }
    }
}
