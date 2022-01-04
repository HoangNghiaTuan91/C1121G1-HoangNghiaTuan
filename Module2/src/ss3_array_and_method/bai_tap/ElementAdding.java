package ss3_array_and_method.bai_tap;

import java.util.Scanner;
import java.util.Arrays;

public class ElementAdding {
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
        System.out.println("\nHãy nhập phần tử cần chèn: ");
        int add = scanner.nextInt();
        System.out.println("\nHãy nhập vị trí phần tử cần chèn: ");
        int addIndex = scanner.nextInt();
        if (addIndex < 0 || addIndex > arr.length - 1) {
            System.out.println("\nKhông chèn được phần tử vào mảng ");
        } else {
            for (int j = arr.length - 1; j > addIndex; j--) {
                arr[j] = arr[j - 1];
            }
            arr[addIndex] = add;
            System.out.print("Mảng mới là: " + Arrays.toString(arr));
        }
    }
}
