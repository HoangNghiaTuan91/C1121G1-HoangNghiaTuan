import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    int[] solution() {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list = new ArrayList<>();
        List<Integer>list1 = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                list.add(arr[i][j]);
            }
        }
        for(int i=0;i<list.size();i++){
            int n =list.get(i);
            boolean a = isPrime(n);
            if(a){
                list1.add(n);
            }
        }
        int[]arr1 = new int[list1.size()];
        for(int i =0;i<list1.size();i++){
            arr1[i]=list1.get(i);
        }
        System.out.println(Arrays.toString(arr1));
        return arr1;

    }
    boolean isPrime (int l){
        boolean flag = false ;
        int k;
        if (l <= 1)
            return false;
        for (k = 2; k <= (l / 2); k++) {
            if (l % k == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Test s = new Test();
        s.solution();
    }
}


