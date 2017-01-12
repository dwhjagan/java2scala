
public class GC {
    public static void main(String[] args) throws InterruptedException {
        A1 a = new A1("white");
        a = null;

        Runtime.getRuntime().gc();
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