package circle;

public class Task15 {
    public static void main(String[] args) {
        long res = 1;
        int sum = 1;
        for (int i = 2; i <= 10; i++) {
            sum += i;
            res *= sum;
        }
        System.out.println(res);
    }
}
