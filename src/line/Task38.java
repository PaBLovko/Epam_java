package line;

public class Task38 {
    public static void main(String[] args){
        int xFirst = 0;
        int yFirst = 0;
        int xSecond = 0;
        int ySecond = 0;

        int xFirstMin = 0;
        int xFirstMax = 1;
        int yFirstMin = -1;
        int yFirstMax = 2;

        int xSecondMin = 1;
        int xSecondMax = 2;
        int ySecondMin = -1;
        int ySecondMax = 2;
        if(xFirst <= xFirstMax && xFirst >= xFirstMin && yFirst <= yFirstMax && yFirst >=yFirstMin)
            System.out.println(true);
        else
            System.out.println(false);
        if(xSecond <= xSecondMax && xSecond >= xSecondMin && ySecond <= ySecondMax && ySecond >=ySecondMin)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
