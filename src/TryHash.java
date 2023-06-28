import java.util.HashMap;
//import java.util.Scanner;
public class TryHash {
    public static void main(String args[])
    {
        HashMap <String, Integer> happy= new HashMap<String, Integer>();
        happy.put("a", 69);
        happy.put("b", 143);
        happy.put("e", 666);
        System.out.println(happy);
        System.out.println(happy.get("e"));
        System.out.println(happy.containsKey("a"));
        System.out.println(happy.containsValue(143));
        happy.remove("b");
        System.out.println(happy);
    }
}
