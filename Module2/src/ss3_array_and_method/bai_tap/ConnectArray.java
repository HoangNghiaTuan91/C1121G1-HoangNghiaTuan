package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ConnectArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng thứ 1");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Hãy nhập phần tử thứ " + i + " của mảng");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập size mảng thứ 2");
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Hãy nhập phần tử thứ " + j + " của mảng");
            arr2[j] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
