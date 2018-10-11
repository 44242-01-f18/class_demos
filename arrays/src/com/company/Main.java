package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] mat;
        int mat2 [][];
        //int [] silly [];
        mat = new int[5][6]; // 5 rows, 6 cols
        mat[2][5] = 9;
        // 0 0 0 0 0 0
        // 0 0 0 0 0 0
        // 0 0 0 0 0 9
        // 0 0 0 0 0 0
        // 0 0 0 0 0 0

        int numrows = mat.length;
        int numcols = mat[0].length;

        // not rectangular
        mat2 = new int[3][];
        mat2[0] = new int [3];
        mat2[1] = new int [1];
        mat2[2] = new int [5];

        for (int i=0; i<mat2.length; i++)
        {
            for (int j=0; j<mat2[i].length; j++)
                System.out.print(mat2[i][j] + " ");
            System.out.println("");
        }
        System.out.println("");
        for (int i=0; i<mat2.length; i++)
        {
            for (int v: mat2[i])
                System.out.print(v + " ");
            System.out.println("");
        }
        System.out.println("");
        for (int [] arr: mat2)
        {
            for (int v: arr)
                System.out.print(v + " ");
            System.out.println("");
        }
        /*
        int [] nums; // creates a reference variable
        int [] nums2;
        // int nums [];
        int x = 5;
        nums = new int[6]; // allocates space and stores the reference
        //System.out.println(x);
        System.out.println(nums);
        //for (int i=0; i<10000000; i++)
        //    x = 5 + (6 * i);
        //nums[5] = 10;
        System.out.println(nums.length);
        for (int i=0; i<nums.length ; i++)
            nums[i] = 2 * i * i;
        // not a copy!
        nums2 = nums.clone();
        //System.arraycopy();
        nums2[4] = -50;
        for (int v: nums)
            System.out.println(v);*/
    }
}
