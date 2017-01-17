package Javaexamples.collectionset.Arraylist;

import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
        ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

	  /* Displaying array list elements */
        System.out.println("Currently the array list has following elements:"+obj);

//   Currently the array list has following elements:[Ajeet, Harry, Chaitanya, Steve, Anuj]

	  /*Add element at the given index*/
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
        obj.remove("Chaitanya");
        obj.remove("Harry");

        System.out.println("Current array list is:"+obj);
  //      Current array list is:[Rahul, Justin, Ajeet, Steve, Anuj]
	  /*Remove element from the given index*/

        obj.remove(1);

        System.out.println("Current array list is:"+obj);
    }
}
/*
Currently the array list has following elements:[Ajeet, Harry, Chaitanya, Steve, Anuj]
Current array list is:[Rahul, Justin, Ajeet, Steve, Anuj]
Current array list is:[Rahul, Ajeet, Steve, Anuj]

 */