//A Sample Program to calculate Gross Salary using Scanner Class
import java.util.Scanner;
public class Employee
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter name of the employee and basic Salary") ;
    double basic,da,hra,pf,np,gp;
    String st;
    st=in.nextLine();
    basic=in.nextInt();
    da=basic*25/100;
    hra=basic*15/100;
            pf=basic*8.33/100;
    gp=basic+da+hra;
    np=gp-pf;
        System.out.println("Name of the employee"+st);
        System.out.println("Gross Pay=Rs."+gp);
        System.out.println("Net Pay=Rs."+np);

    }
}
