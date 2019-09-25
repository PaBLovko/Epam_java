package circle;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Input X");
            int X = in.nextInt();
            System.out.println("Input Y");
            int Y = in.nextInt();
            double Z = 0;
            char symbol = in.next().charAt(0);
            switch (symbol) {
                case '/':
                    if (Y != 0) {
                        Z = X / Y;
                        System.out.println("Z равен :" +Z);
                    } else System.out.println("Нельзя делить на 0 ");
                    break;
                case '*':
                    Z = X * Y;
                    System.out.println("Z равен :" +Z);
                    break;
                case '-':
                    Z = X - Y;
                    System.out.println("Z равен :" +Z);
                    break;
                case '+':
                    Z = X + Y;
                    System.out.println("Z равен :" +Z);
                    break;
                case '0':
                    return;
                default: {
                    System.out.println("Такой функции нет");
                    break;
                }
            }
        }
    }
}
