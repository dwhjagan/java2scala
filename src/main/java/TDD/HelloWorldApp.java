package TDD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by janaidu on 17/01/2017.
 */
public class HelloWorldApp {

    public HelloWorldApp(List<String> arraylist1, List<String> arraylist2) {
        this.arraylist1 = arraylist1;
        this.arraylist2 = arraylist2;
    }

    private List<String> arraylist1 = new ArrayList<String>();
    private List<String> arraylist2 = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        System.out.printf("");
        System.out.println("HelloWorldApp.main");
        System.out.println("HelloWorldApp.main");
        System.out.println();
        System.out.println("true = " + true);

    }
}
