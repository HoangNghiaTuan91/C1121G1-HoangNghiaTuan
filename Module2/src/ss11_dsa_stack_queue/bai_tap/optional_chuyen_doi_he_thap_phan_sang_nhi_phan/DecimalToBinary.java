package ss11_dsa_stack_queue.bai_tap.optional_chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên cần chuyển đổi");
        int decimal = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (decimal != 0) {
            int temp = decimal % 2 == 0 ? 0 : 1;
        stack.push(temp);
        decimal/=2;
        }
        System.out.println(stack);
    }
}
