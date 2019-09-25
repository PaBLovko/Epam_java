package circle;

public class Task18 {
    public static void main(String[] args) {
        double e=0.1;
        double res=0;
        for(int n=1;n<7;n++){
          double buffer=Math.pow(-1,n-1)/n;
          if(Math.abs(buffer)>=e) res+=buffer;
        }
        System.out.println(res);
    }
}
