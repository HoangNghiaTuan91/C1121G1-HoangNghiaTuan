package ss11_dsa_stack_queue.bai_tap.optional_chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên cần chuyển đổi");
        int decimal = Integer.parseInt(scanner.nextLine());
        int tempDecimal = Math.abs(decimal);
        Stack<Integer> stack = new Stack<>();

        while (tempDecimal != 0) {
            int temp = tempDecimal % 2 == 0 ? 0 : 1;
            stack.push(temp);
            tempDecimal /= 2;
        }
        if (decimal < 0) {
            stack.push(1);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");
        }

    }
}
