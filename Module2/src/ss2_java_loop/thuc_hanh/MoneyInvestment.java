package ss2_java_loop.thuc_hanh;

import java.util.Scanner;

public class MoneyInvestment {
    public static void main(String[] args) {
        double money = 1.0;
        double interestRate = 1.0;
        int month = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền muốn gửi");
        money = scanner.nextDouble();
        System.out.println("Nhập vào số tháng muốn gửi");
        month = scanner.nextInt();
        System.out.println("Nhập vào lãi suất ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
