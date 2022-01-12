package ss11_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack<E> {
    public static void main(String[] args) {
        stackOfInteger();
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
        for(int i=0; i<array.length; i++) {
          stack.push(array[i]);
        }
        System.out.println("Chuỗi đảo ngược: ");
        for(int i=0; i<array.length; i++) {
            System.out.print(stack.pop()+" ");
        }
    }
    }
