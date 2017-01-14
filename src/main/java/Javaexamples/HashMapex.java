package Javaexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashMapex {
    public static void main(String[] args) {

        List lnkLst = new ArrayList();

        lnkLst.add("element1");
        lnkLst.add("element2");
        lnkLst.add("element3");

        Iterator itr = lnkLst.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }

    }
}