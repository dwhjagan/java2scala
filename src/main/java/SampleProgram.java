import java.util.HashMap;
import java.util.Map;

public class SampleProgram {

    private int customerID;

    public SampleProgram(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public int hashCode() {
        return customerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SampleProgram)) return false;

        SampleProgram that = (SampleProgram) o;

        return customerID == that.customerID;
    }

        public static void main(String[] args) {

            Map<SampleProgram, String> m = new HashMap<SampleProgram, String>();
            SampleProgram cust = new SampleProgram(18);
            m.put(cust, "100");

            // retrieving using another instance
            System.out.println(m.get(new SampleProgram(18)));
            // retrieving using same instance
            System.out.println(m.get(cust));

        }
    }