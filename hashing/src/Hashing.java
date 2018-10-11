import java.util.ArrayList;
public class Hashing {
    // position is based on the value
    public static void main(String args[])
    {
        // determine numerical representation
        System.out.println("bob".hashCode());
        System.out.println("alice".hashCode());
        System.out.println("eve".hashCode());
        Integer intnum = 5;
        System.out.println(intnum.hashCode());

        ArrayList<String> table = new ArrayList<>();
        for (int i=0; i<10; i++)
            table.add("");
        System.out.println(table);

        table.set("bob".hashCode()%10, "bob");
        table.set("alice".hashCode()%10, "alice");
        System.out.println(table);
        System.out.println("trudy".hashCode());
    }
}
