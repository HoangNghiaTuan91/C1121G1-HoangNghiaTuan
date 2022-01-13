package ss11_dsa_stack_queue.bai_tap.kiem_tra_palindrome_su_dung_queue;

import java.util.*;

public class PalindromeChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào câu cần kiểm tra palindrome");
        String str = scanner.nextLine().toLowerCase();
        String[] arrayString = str.split("");
        System.out.println(Arrays.toString(arrayString));
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String s : arrayString) {
            stack.push(s);
            queue.add(s);
        }
        boolean check = true;
        for (int i = 0; i < arrayString.length; i++) {
            if (!(stack.pop().equals(queue.poll()))) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("đây là palindrome");
        } else {
            System.out.println("đây không phải là palindrome");
        }

    }
}
