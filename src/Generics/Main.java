package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> listInt = new GenericList<>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(4);

        GenericList<User> listUser = new GenericList<>();
        listUser.add(new User("james"));
        listUser.add(new User("karl"));
        listUser.add(new User("lion"));
        //printUser(listUser);

        ArrayList<User> listUser2 = new ArrayList<>();
        listUser2.add(new User("james2"));
        listUser2.add(new User("karl2"));
        listUser2.add(new User("lion2"));
        //printList(listUser2);

    }

    public static void printUser(GenericList<?> list){
        System.out.println(list.get(0));
    }

    public static void printList(List<?> list){
        list.forEach(System.out::println);
        }
    }

