package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("aames", "w"));
        customers.add(new Customer("bion", "a"));
        customers.add(new Customer("crank", "t"));
        //Collections.sort(customers);
        Collections.sort(customers,new CostumerEmailComparator());
        System.out.println(customers);
    }
}
