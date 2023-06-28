import java.io.*;

public class SupriyaInputs {
    public static void main(String[] args)throws IOException {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(read);
        char ch='$';
    System.out.println("Enter an Integer: ");
    int i= Integer.parseInt(br.readLine());
    System.out.println("Enter a String: ");
    String s= br.readLine();
    System.out.println("Enter a Double: ");
    double d= Double.parseDouble(br.readLine());
    System.out.println("Enter a Float: ");
    float f= Float.parseFloat(br.readLine());
    System.out.println("Enter a Long: ");
    long l=Long.parseLong(br.readLine());
    System.out.println("Enter a Boolean: ");
    boolean b= Boolean.parseBoolean(br.readLine());
    System.out.println("integer "+i+"\nstring "+s+"\ncharacter "+ch+"\ndouble "+d+"\nfloat "+f+"\nlong "+l+"\nboolean "+b);
}
}

