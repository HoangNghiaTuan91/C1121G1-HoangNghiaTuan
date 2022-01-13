package ss11_dsa_stack_queue.bai_tap.su_dung_map_dem_so_lan_xuat_hien_1_tu;


import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 câu hoặc 1 văn bản cần đếm số từ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] arrayString = str.split(" ");
        Map<String, Integer> myMap = new TreeMap<>();
        myMap.put(arrayString[0], 1);

        for (int i = 1; i < arrayString.length; i++) {
            int count = 1;

            for (String word : myMap.keySet()) {
                if (word.equals(arrayString[i])) {
                    count = myMap.get(word) + 1;
                }
            }
            myMap.put(arrayString[i], count);
        }
        System.out.println(myMap);
    }
}
