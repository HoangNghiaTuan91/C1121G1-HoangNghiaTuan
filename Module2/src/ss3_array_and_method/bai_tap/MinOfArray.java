package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Hãy nhập phần tử thứ " + i + " của mảng");//Nhập thủ công
//            arr[i] = scanner.nextInt();
            arr[i]= (int) (Math.random()*100);//Nhập tự động
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
        System.out.println("Giá trị lớn nhất mảng 2 chiều mới nhập là: " + min);
        System.out.println("Giá trị lớn nhất mảng 2 chiều mới nhập tại index là : " + minIndex);
    }
}
