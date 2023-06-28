//to find commission
import java.io.*;
public class Commission
{
    public static void main(String[] args) throws IOException {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(read);
        System.out.println("Enter sale amount");
        double sale=Double.parseDouble(br.readLine());
        double comm= (sale>15000)?0.05*sale:0.0;
        System.out.println("The commission is "+ comm);

    }
}
