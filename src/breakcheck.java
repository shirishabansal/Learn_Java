//to check usage of break
public class breakcheck
{
    public static void main(String[] args) {
        for(int i=5;i>0;i--)
        {
            System.out.println("line 1");
            System.out.println("line 2");
            System.out.println("line 3");
            if(i==3) {
                //on continue it will go to the top of the for loop instead of the if statement
                System.out.println("line 4");
                continue;
                //System.out.println("line 5");
            }
            System.out.println("line 6");
            if(i==2)
            {
                System.out.println("line 7");
                break;
               // System.out.println("line 8");
                //after break it exits loop
            }
            System.out.println("line 9");
        }
    }
}
