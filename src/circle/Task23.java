package circle;

public class Task23 {
    public static void main(String[] args) {
        double buffer,b=5,h=0.5;
        for (double x=1;x<=b;x+=h){
            buffer=1/Math.tan(x/3)+0.5*Math.sin(x);
            System.out.println("значение аргумента: "+ x+" Значение функции: "+buffer);
        }
    }
}
