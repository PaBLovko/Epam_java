package circle;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int temp = 1, i = 1, res = 0, ne=0;

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            while (temp > 0) {
                if (i % 2 == 0) {
                    temp = (int) (n/Math.pow(10,i-1) % 10);
                    i++;
                    res += temp;
                } else {
                    temp = (int) (n/Math.pow(10,i-1) % 10);
                    i++;
                }
            }
            for (int z=1;z<i;z++){
               temp= (int) ((int) (n/Math.pow(10,z-1))%10*Math.pow(10,i-z-2));
               ne+=temp;
            }

        } else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
