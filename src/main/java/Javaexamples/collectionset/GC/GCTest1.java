package Javaexamples.collectionset.GC;

public class GCTest1 {

    public static void main(String[] args) throws InterruptedException {
        A a = new A("white");
          a = null;

        Runtime.getRuntime().gc();
    //    System.out.println(color + " cleaned");;
    }
}

class A {
    private String color;

    public A(String color) {
        this.color = color;
    }

    @Override
    public void finalize() {
        System.out.println(this.color + " cleaned");
    }
}