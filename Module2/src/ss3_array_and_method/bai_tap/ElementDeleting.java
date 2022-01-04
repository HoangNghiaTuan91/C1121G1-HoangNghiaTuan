package ss3_array_and_method.bai_tap;

import java.util.Scanner;
import java.util.Arrays;

public class ElementDeleting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hãy nhập phần tử thứ " + i + " của mảng");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa tạo là: " + Arrays.toString(arr));
        System.out.println("\nHãy nhập phần tử cần xóa: ");
        int del = scanner.nextInt();
        boolean check = true;
        int indexDel;
        for (int j = 0; j < arr.length; j++) {
            if (del == arr[j]) {
                indexDel = j;
                if (arr.length - 1 - indexDel >= 0)
                    System.arraycopy(arr, indexDel + 1, arr, indexDel, arr.length - 1 - indexDel);
                arr[arr.length - 1] = 0;
                j--;
            }
            else {
                check = false;
            }
        }
        if (check) {
            System.out.println("Không có phần tử cần xoá trong mảng");
        } else {
            System.out.println("Mảng mới là " + Arrays.toString(arr));
        }
    }
}
