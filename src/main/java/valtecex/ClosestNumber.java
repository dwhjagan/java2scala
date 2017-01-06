package valtecex;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumber {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of elements");

        int c=s.nextInt();  // Returns the next pseudorandom,uniformly distributed int value from this random number generator's sequence.
        int[] a=new int[c];

        System.out.println("Enter the ArrayBSearch Element");

        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }


        Arrays.sort(a);

        int minimalDiff = 0;
        for(int i=0;i<a.length;i++) {
            if (i < a.length - 1) {
                if(i == 0 ){
                    minimalDiff = a[i + 1] - a[i];
                } else if(a[i + 1] - a[i] <= minimalDiff){
                    minimalDiff = a[i + 1] - a[i];
                }
            }
        }

        for(int i=0;i<a.length;i++) {

            if (i < a.length - 1 && a[i + 1] - a[i] <= minimalDiff) {

                System.out.println("Closest Number   " + (a[i] + " " + a[i + 1]));

            }
        }

    }
}

/*
Enter the no of elements
5
Enter the ArrayBSearch Element
89 34 23 11 99
Closest Number   11 23
 */