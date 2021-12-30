package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;
public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Hãy nhập số tiền USD: ");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println("Số tiền VND là: " + vnd + " VND");
    }
}
