import java.util.*;
class Pairs {
    public static int[] sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Pairs ob = new Pairs();
        System.out.println("Enter the number of arrays");
        int n= in.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("enetr number of elements in array");
            int l = in.nextInt();
            System.out.println("ENter array");
            int arr[] = new int[l];
            int arr2[] = new int[l];
            for (int j = 0; j < l; j++) {
                arr[j] = in.nextInt();
                arr2 = ob.sort(arr);
            }

            for (int k = 0; k < l; k++) {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            for (int k = 0; k < l; k++) {
                System.out.print(arr2[k]+" ");
            }
        }

    }
}
