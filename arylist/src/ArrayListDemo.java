import java.util.ArrayList;

public class ArrayListDemo {
    // How do I add to it?
    // How do I remove from it?
    // How do I search in it?
    // How do I access or modify data in it?

    // How fast is each one of these?

    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al.size());
        al.add(5);
        System.out.println(al);
        System.out.println(al.size());
        al.set(0, 8);
        System.out.println(al);
        al.add(0, 17);
        System.out.println(al);
    }


}
