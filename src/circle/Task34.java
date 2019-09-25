package circle;

public class Task34 {
    public static void main(String[] args) {
      for(int number=1000;number<10000;number++){
          int a=number%10;
          int b=number/10%10;
          int c=number/100%10;
          int d=number/1000%10;
          if ((a+b+c+d)==15){
              System.out.println("Совпадение найденно "+number);
          }
      }

    }

}
