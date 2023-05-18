// We can change the value of StringBuffer, it is mutable(String is not).

public class StringBufferExample {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Astha");
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Srivastava");

        System.out.println(sb);

        sb.insert(6, "Java ");
        System.out.println(sb);
    }
}
