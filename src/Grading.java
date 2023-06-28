import java.util.Scanner;
public class Grading
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks");
        int m= in.nextInt();
        String grade= (m>=90)?"A":(m>=80)?"B":"C";
        System.out.println("Your grade is "+grade);
    }
}
