package valtecex.ex;

import java.util.Scanner;

class Arraysum
{
    public static void main(String args[])
    {
        // Create a Scanner object for taking input from cmd
        Scanner s=new Scanner(System.in);

        // Take the no.of elements that user want to sum
        int n=s.nextInt();

        // Create an array of given size (n)
        int[] a=new int[n];

        // Initialize sum to 0
        int sum=0;

        // Loop till end of array
        for(int i=0;i<a.length;i++)
        {
            // Read int from user and store it in each element
            a[i]=s.nextInt();
            // Sum every element that user gives and store it in sum
            sum+=a[i];
        }
        System.out.println("The sum of all the elements is "+sum);
    }
}
/*
5
1
2
3
4
5
The sum of all the elements is 15

Process finished with exit code 0

 */