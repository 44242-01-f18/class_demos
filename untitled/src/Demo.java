import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
public class Demo {
    public static int power(int a, int b)
    {
        if (b == 0)
            return 1;
        return a * power(a, b-1);
    }
    public static void main(String args[]){
        System.out.println(power(2, 5));
        System.out.println(power(3, 4));
        System.out.println(power(2, -1));
        /*
        HashSet<Integer> attendees = new HashSet<>();
        Random r = new Random();
        attendees.add(510);
        attendees.add(913);
        attendees.add(510);
        for (Integer i: attendees)
            System.out.println(i);
        System.out.println(attendees);

        HashMap<String, String> eboard = new HashMap<>();
        eboard.put("president", "Kevin");
        eboard.put("mentor", "Me");
        eboard.put("vp", "Nick");
        System.out.println(eboard);
        eboard.put("president", "Nick");
        System.out.println(eboard);

        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i=0; i<10; i++)
        {
            int rn = r.nextInt() % 1000;
            hs.add(rn);
            al.add(rn);
        }
        System.out.println("HS: " + hs);
        System.out.println("AL: " + al);
        */
    }
}
