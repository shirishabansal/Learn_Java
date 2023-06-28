//to calculate the years, months and days from days.
//we take every year to have 365.25 days and every month to have 30 days.
import java.io.*;
public class DMY {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        double d;
        System.out.println("Enter the number of days ");
        //number of days can be a fraction
        d = Double.parseDouble(in.readLine());
        dmy(d);
    }
    public static void dmy(double d){
        int y,m,d_left;
        y=(int)(d/365.25);
        d=(int)(d%365.25);
        d=(int)d;
        m=(int)(d/30);
        d%=30;
        System.out.println("years: "+y+" months: "+m+" days: "+d);
    }
}
