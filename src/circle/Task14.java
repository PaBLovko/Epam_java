package circle;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        double result=0;
        for (double i=0;i<n;i++){
            System.out.println(result+=1/(i+1));
        }
    }
}
