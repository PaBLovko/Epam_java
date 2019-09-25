package branching;

import java.util.Scanner;

public class Task32 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a,b,c");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a+b)%2 == 0)  System.out.println ("Even a+b");
        else if ((c+b)%2 == 0) System.out.println("Even b+c");
        else if ((a+c)%2 == 0) System.out.println("Even a+c");
        else if (((a+b)%2 != 0) && (a+c)%2 != 0 && (c+b)%2 != 0) System.out.println("no even amount");
    }
}
