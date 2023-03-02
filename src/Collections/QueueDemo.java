package Collections;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //Permite almacenar objetos y luego recuperarlos en el orden en el cual se insertaron.
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("c");
        queue.offer("b");
        queue.offer("a");
        queue.offer("d");
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);





    }
}
