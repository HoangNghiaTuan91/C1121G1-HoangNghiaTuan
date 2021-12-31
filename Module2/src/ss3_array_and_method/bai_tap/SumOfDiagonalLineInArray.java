package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class SumOfDiagonalLineInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng và số cột");
        int n = scanner.nextInt();
//        System.out.println("Nhập số cột");
//        int m = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);//Nhập tự động
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số trong đường chéo của mảng 2 chiều vuông là " + sum);
    }
}
