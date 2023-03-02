package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
         data.addLast(10);
         data.addLast(20);
         data.addLast(30);

        System.out.println(data.contains(10));
        System.out.println(data.indexOf(10));
        System.out.println(data);
        System.out.println(data.size());
    }
}
