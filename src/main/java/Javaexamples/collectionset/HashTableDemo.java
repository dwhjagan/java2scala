package Javaexamples.collectionset;

 import java.util.*;

 public class HashTableDemo {
 public static void main(String args[]) {
 // create hash table
     HashMap<Integer, String> htable = new HashMap<Integer, String>();
     Hashtable HT = new Hashtable();
     TreeMap tm = new TreeMap();
     LinkedHashMap LHP = new LinkedHashMap<>();

                 // put values into the table
         htable.put(1, "A");
         htable.put(29, "B");
         htable.put(3, "C");
         htable.put(4, "D");

        // put values into the table
         tm.put(1, "A");
         tm.put(29, "B");
         tm.put(3, "C");
         tm.put(4, "D");

         // put values into the table
         HT.put(1, "A");
         HT.put(29, "B");
         HT.put(3, "C");
         HT.put(4, "D");

     // put values into the table

         LHP.put(1, "A");
         LHP.put(29, "B");
         LHP.put(3, "C");
         LHP.put(4, "D");

     Map maplhp= Collections.synchronizedMap(LHP);  // Collections class.

    Set maplhpset = maplhp.entrySet();

 // check table content

     System.out.println("Hash Map content: "+htable);
     System.out.println("Tree Map table content: "+tm);
     System.out.println("Hash table content: "+HT);
     System.out.println("Linked Hash Map table content: "+LHP);
     System.out.println("Linked Hash Map table content: "+maplhpset);
 }
 }