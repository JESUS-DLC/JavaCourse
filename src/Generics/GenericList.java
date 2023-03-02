package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GenericList<T> implements Iterable<T>{
    //private T[] items =(T[]) new Object[10];

    private ArrayList<T> list = new ArrayList<>();
    private int count;

    public void add(T item){
        list.add(item);
    }

    public T get(int index){
        return list.get(index);
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}


