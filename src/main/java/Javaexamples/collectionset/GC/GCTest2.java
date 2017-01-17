package Javaexamples.collectionset.GC;


public class GCTest2 {
    public static void main(String[] args) throws InterruptedException {
        A1 a = new A1("white");

        for (int i = 0; i < 100000000; i++) {
            if (i % 2 == 1) {
                a = new A1("red");
            } else {
                a = new A1("green");
            }
            a = null;
        }
    }
}

class A1 {
    private String color;

    public A1(String color) {
        this.color = color;
    }

    @Override
    public void finalize() {
        System.out.println(this.color + " cleaned");
    }
}