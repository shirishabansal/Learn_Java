import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size=sc.nextInt();
        int unsortedArray[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i <size;i++)
            unsortedArray[i]=sc.nextInt();
        for(int i=1;i<size;i++)
        {
            int key=unsortedArray[i];
            for(int j=i-1;j>=0 && unsortedArray[j]>key ;j--) //make it unsortedArray[j]<key for desc order
            {
                unsortedArray[j+1]=unsortedArray[j];
                unsortedArray[j]=key;
            }
        }
        for(int i=0;i<size;i++)
            System.out.print(unsortedArray[i]+ " ");
    }
}
