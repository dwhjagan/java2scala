package Javaexamples.collectionset.temp;

public class testcode {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof testcode)) return false;

        testcode testcode = (testcode) o;

        if (Name != null ? !Name.equals(testcode.Name) : testcode.Name != null) return false;
        return Name1 != null ? Name1.equals(testcode.Name1) : testcode.Name1 == null;
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + (Name1 != null ? Name1.hashCode() : 0);
        return result;
    }

    private String Name = "JA";
    private String Name1 = "Ja";



    public static void main(String[] arg){
        testcode   testcode = new testcode();
        testcode.toString();
        System.out.print(testcode.Name);

    }
}
