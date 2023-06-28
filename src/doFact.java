import java.util.*;
public class doFact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,n,f=1;
        System.out.println("Enter the number to find its factorial");
        n=sc.nextInt();
        i=n;
        do{
            f=f*i;
            i--;
        }
            while(i>1);
        System.out.println(f);
    }
}
