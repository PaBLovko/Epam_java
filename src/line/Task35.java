package line;

public class Task35 {
    public static void main(String[] args) {
        double M=150;
        double N=14;
        double fin=M/N;
        int x= (int) (M/N);
        int fractional= (int) ((fin-x)*10);
        int whole=(int)(fin%10);
    }
}
