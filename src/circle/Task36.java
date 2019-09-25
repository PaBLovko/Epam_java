package circle;

public class Task36 {
    public static void main(String[] args) {
        for(int number=1212;number<8888;number++){
            int first=number%100;
            int second=number/100%100;
            if(first!=0 && number%(first*second)==0){
                System.out.println(number);
            }
        }
    }
}
