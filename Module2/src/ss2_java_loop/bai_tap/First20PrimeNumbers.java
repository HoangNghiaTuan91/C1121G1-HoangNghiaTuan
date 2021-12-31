package ss2_java_loop.bai_tap;

public class First20PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count < 20) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(N+" ");
                count++;
            }
            N++;
        }
    }
}
