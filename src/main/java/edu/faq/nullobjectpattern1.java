package edu.faq;

 abstract class AbstractCustomer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}

 class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {     // constructor
        this.name = name;
    }

    @Override
    public String getName() {              // method
        return name;
    }

    @Override
    public boolean isNil() {              // method
        return false;
    }
}

 class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {                 // method
        return "Not Available in Customer Database";
    }

    @Override                                // method
    public boolean isNil() {
        return true;
    }
}

 class CustomerFactory {

    public static final String[] names = {"Rob1234", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

public class nullobjectpattern1 {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob1234");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}


