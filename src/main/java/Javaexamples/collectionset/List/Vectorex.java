package Javaexamples.collectionset.List;

// a quantity having direction as well as magnitude, especially as determining the position of one point in space relative to another.

import java.util.Enumeration;
import java.util.Vector;
public class Vectorex {

    public static void main(String args[]) {
        // initial size is 3, increment is 2
        Vector v = new Vector(3,8);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(new Integer(1));   // 1
        v.addElement(new Integer(2));   // 2
        v.addElement(new Integer(3));   // 3
        v.addElement(new Integer(10));  // 4

        System.out.println("Initial size: " + v.size());
        System.out.println("capacity: " + v.capacity());

        v.addElement(new Double(5.45));   //5
        v.addElement(new Double(6.45));   //6
        System.out.println("Current capacity: " + v.capacity());
        System.out.println("Initial size: " + v.size());


        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();

    }
}

// a quantity having direction as well as magnitude, especially as determining the position of one point in space relative to another.
