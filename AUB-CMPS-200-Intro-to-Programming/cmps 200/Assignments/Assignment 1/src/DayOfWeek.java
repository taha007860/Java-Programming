public class DayOfWeek {
    public static int weekday(int m, int d, int y){
        int x, d0, m0, y0;
        y0=y-((14-m)/12);
        x=y0+y0/4-y0/100+y0/400;
        m0 =m+(12*((14-m)/12))-2;
        d0=(d+x+(31*m0)/12)%7;
        return d0;

    }
    public static void main(String[] args){
       int z= weekday(1, 2, 2022);
       System.out.println(z);
    }
}
