/**
 *
 */
public class Customerex {

    public Customerex(String name, int dob) {
        Name = name;
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customerex)) return false;

        Customerex that = (Customerex) o;

        if (dob != that.dob) return false;
        return Name != null ? Name.equals(that.Name) : that.Name == null;
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + dob;
        return result;
    }

    public Customerex() {
        super();
    }

    private String Name;
    private int dob;

    public static void main(String[] args) {

        System.out.printf("");



    }
}
