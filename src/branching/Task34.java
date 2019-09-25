package branching;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость книг и сумму");
        int bookValue = in.nextInt();
        int money = in.nextInt();
        if (money == bookValue) System.out.println("Спасибо!");
        else if(money > bookValue) System.out.println("Сдача "+(money - bookValue));
        else System.out.println("Нужно еще "+(bookValue - money));
    }
}
