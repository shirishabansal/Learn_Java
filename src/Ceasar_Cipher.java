import java.util.Scanner;
public class Ceasar_Cipher {
        public static StringBuffer encrypt(String text, int s)
        {
            StringBuffer result= new StringBuffer();

            for (int i=0; i<text.length(); i++)
            {
                if (Character.isUpperCase(text.charAt(i)))
                {
                    char ch = (char)(((int)text.charAt(i) +
                            s - 65) % 26 + 65);
                    result.append(ch);
                }
                else
                {
                    char ch = (char)(((int)text.charAt(i) +
                            s - 97) % 26 + 97);
                    result.append(ch);
                }
            }
            return result;
        }

        // Driver code
        public static void main(String[] args)
        {
            Scanner in= new Scanner(System.in);
            System.out.println("Enter the text to be ciphered and the key");
            String text = in.nextLine();
            int s = in.nextInt();
            System.out.println("Text : " + text);
            System.out.println("Shift : " + s);
            System.out.println("Cipher: " + encrypt(text, s));
        }
    }
