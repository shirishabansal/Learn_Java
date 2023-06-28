public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("India"); //to become aidnI.
        //reverse and swap half the string to save time and improve efficiency
        int l=sb.length();
        for(int i=0;i<(l/2);i++)
        {
            //swap i with l-1-i index
            char a=sb.charAt(i);
            char b=sb.charAt(l-1-i);
            sb.setCharAt(i,sb.charAt(l-1-i));
            sb.setCharAt(l-1-i,a);
        }
        System.out.println(sb);
    }
}
