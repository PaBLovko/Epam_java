package line;

public class Task28 {
    public static void main(String[] args) {
        double rad = 3.15;
        double grad=(rad*180)/Math.PI;
        double min=(grad*60)%60;
        int second= (int) ((min*60)%60);
    }
}
