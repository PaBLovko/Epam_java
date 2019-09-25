package branching;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input password: ");
        int password = in.nextInt();
        if (password == 9583 || password == 1747)
            System.out.println("A, B , C");
        else if (password == 333 || password == 7992)
            System.out.println("B , C");
        else if (password == 9455 || password == 8997)
            System.out.println("C");
        else
            System.out.println("Invalid password");
    }
}
