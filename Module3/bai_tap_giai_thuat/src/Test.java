public class Test {
    static Test test = new Test();
    public void Star(int n){
        for (int i = n / 2; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2* i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        test.Star(10);
    }
}