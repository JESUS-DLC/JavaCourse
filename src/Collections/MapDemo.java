package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer("a", "e1");
        Customer c2 = new Customer("b", "e2");
        Customer c3 = new Customer("c", "e3");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        Customer unknow  = new Customer("unknow","");

        Customer customer = map.getOrDefault("e1",unknow);
        Boolean contains = map.containsKey("e1");
        map.replace("e1",new Customer("a++","e1"));

        System.out.println(contains);
        System.out.println(map);
    }
}
