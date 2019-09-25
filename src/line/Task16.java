package line;

public class Task16 {
    public static void main(String[] args) {
        int x = 7788;
        int m=1;
        for (int i = 0; i < 4; i++) {
            x =x/10;
            m *=x%10;
        }
    }
}
