public class Strings {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Shirisha Bansal");
        System.out.println(sb.charAt(3));
        //set char at index
        sb.setCharAt(3,'R'); //can't write this with sout as string undergoes mutation here.
        System.out.println(sb);

        //insert function inserting character
        sb.insert(9,'*');
        System.out.println(sb);

        //insert function inserting string
        sb.insert(0,"Hey ");
        System.out.println(sb);

        //delete whatever is from index 6,7 and 8
        sb.delete(6,9);
        System.out.println(sb);

        //appending meaning characters jodna
        sb.append("awesome");
        System.out.println(sb);
    }
}
