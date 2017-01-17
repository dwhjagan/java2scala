public class Customer {

    private String Name;
    private int Id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (Id != customer.Id) return false;
        return Name != null ? Name.equals(customer.Name) : customer.Name == null;
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + Id;
        return result;
    }

    public static void main(String[] args) {
        Customer Customer = new Customer();
        System.out.println("args = [" + args + "]");
        System.out.println(Customer.Id);

    }
}



