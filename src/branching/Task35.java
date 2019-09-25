package branching;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int month = 1;
        int day = in.nextInt();
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        while (day > days[-1 + month]){
            day -= days[-1 + month++];
        }
        System.out.println("Month = " + month + ", day = " + day);
    }
}
