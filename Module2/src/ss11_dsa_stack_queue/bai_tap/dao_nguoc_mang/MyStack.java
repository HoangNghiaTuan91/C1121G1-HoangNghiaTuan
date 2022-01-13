package ss11_dsa_stack_queue.bai_tap.dao_nguoc_mang;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack<E> {
    public static void main(String[] args) {
        stackOfInteger();
        System.out.println();
        stackOfString();
    }

    public static void stackOfInteger() {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài n của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("Chuỗi đảo ngược: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void stackOfString() {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi kí tự");
        String str = scanner.nextLine();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
        }

    }
}
