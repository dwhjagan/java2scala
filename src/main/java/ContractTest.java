import java.util.HashMap;
import java.util.Map;

public class ContractTest {
}

class EmployeeKey{

    public EmployeeKey(String empid, String dob) {
        this.empid = empid;
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeKey)) return false;

        EmployeeKey that = (EmployeeKey) o;

        if (empid != null ? !empid.equals(that.empid) : that.empid != null) return false;
        return dob != null ? dob.equals(that.dob) : that.dob == null;
    }

    @Override
    public int hashCode() {
        int result = empid != null ? empid.hashCode() : 0;
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        return result;
    }

    String empid;
    String dob;

    public static void main(String[] args) {
Map<EmployeeKey, String> cache = loadEmpCache();
EmployeeKey lookUpKey = new EmployeeKey("101","06071985" );
String empName = cache.get(lookUpKey);
        System.out.println(empName);
    }

    static Map<EmployeeKey, String> loadEmpCache(){
        EmployeeKey ek1 = new EmployeeKey("100", "06071984");
        EmployeeKey ek2 = new EmployeeKey("101", "06071985");
        EmployeeKey ek3 = new EmployeeKey("102", "06071988");

    Map<EmployeeKey, String> cache = new HashMap<>();
        cache.put(ek1, "Bob");
        cache.put(ek2, "Ram");
        cache.put(ek3, "Guru");

       return cache;
    }

}