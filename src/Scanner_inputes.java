//W.A.P. to display the grades according to the marks
import java.util.Scanner;
public class Scanner_inputes
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int m;
        String nm;
        System.out.println("Please Enter the name of the student");
        nm=in.next();
        System.out.println("Enter the average marks obtained");
        m=in.nextInt();
        System.out.println("Student's name"+ nm);
        if(m>80)
            System.out.println("Grade:Distinction");
        if(m>=60&&m<80);
        System.out.println("Grade:First Division");
        if(m>=45&&m<60);
        System.out.println("Grade:Second Division");
        if(m>=40&&m<45);
        System.out.println("Grade:Pass");
        if(m<40)
            System.out.println("No grade");

    }
}
