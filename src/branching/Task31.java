package branching;

import java.util.Scanner;

public class Task31 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input A,B and x,y,z");
        int A = in.nextInt();
        int B = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (((A < x) && (B < y)) || ((A < x) && (B < z)) || ((A < z) && (B < y)))
            System.out.println("False");
        else  System.out.println("True");
    }
}
