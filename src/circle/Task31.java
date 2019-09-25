package circle;

import java.util.ArrayList;
import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean find = false;
        for (int i = 0; i < 5; i++) {
            int buffer = in.nextInt();
            list.add(buffer);
        }
        while (true) {
            int m = in.nextInt();
            if (m == 0) return;
            for (int i = 0; i < 5; i++) {
                if (list.get(i) == m) {
                    System.out.println("Вы угадали " + m);
                    find = true;
                }
            }
            if (!find)
                System.out.println("Такого числа как " + m + " нет");
            else find = false;
        }
    }
}
