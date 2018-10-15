package com.company;
import java.util.HashSet;
import java.util.TreeSet;
public class Main {


    public static void main(String[] args) {
	// write your code here
        HashSet<String> hs = new HashSet<String>();
        hs.add("alice");
        hs.add("trudy");
        hs.add("eve");
        hs.add("bob");
        System.out.println("Hash set: " + hs);

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("alice");
        ts.add("trudy");

        ts.add("bob");
        ts.add("eve");
        System.out.println("Tree set: " + ts);
    }
}
