package ss3_array_and_method.bai_tap;

//import java.util.Arrays;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int n = scanner.nextInt();
        System.out.println("Nhập số cột");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử " + i + "-" + j + " của mảng");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        String maxIndex = (0 + "-" + 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxIndex = (i + "-" + j);
                }
            }
        }
        System.out.println("Giá trị lớn nhất mảng 2 chiều mới nhập là: " + max);
        System.out.println("Giá trị lớn nhất mảng 2 chiều mới nhập tại index là : " + maxIndex);
    }
}
