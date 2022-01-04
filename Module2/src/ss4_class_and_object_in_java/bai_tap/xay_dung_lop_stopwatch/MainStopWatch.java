package ss4_class_and_object_in_java.bai_tap.xay_dung_lop_stopwatch;

import java.util.Random;

public class MainStopWatch {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random();
        int[] newArray = new int[100000];
        for (int i = 0; i < 100000; i++) {
            newArray[i] = random.nextInt(100000);
        }
        stopWatch.start();
        selectionSort(newArray);
        stopWatch.stop();
        System.out.println("Sắp xếp mảng gồm 100000 phần tử mất " + stopWatch.getElapsedTime() + " milliseconds");
    }
}
