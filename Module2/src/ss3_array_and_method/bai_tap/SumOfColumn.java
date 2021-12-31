package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int n = scanner.nextInt();
        System.out.println("Nhập số cột");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println("Nhập phần tử " + i + "-" + j + " của mảng");
//                arr[i][j] = scanner.nextInt();
                arr[i][j] = (int) (Math.random() * 100);//Nhập tự động
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập vị trí cột muốn tính tổng");
        int column = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == column) {
                    sum += arr[i][column];
                }
            }
        }
        System.out.println(sum);
    }
}
