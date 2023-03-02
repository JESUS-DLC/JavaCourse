package BigO;

public class Main {
    public static void main(String[] args) {

    }

    public static void log(int[] numbers){
        //bigO O(1) constant time
        System.out.println(numbers[0]);
    }

    public static void log2(int[] numbers){
        //bigO O(n) grows linearly (size of the input)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void log3(int[] numbers){
        //bigO O(n^2)
        for (int first:numbers) {
            for (int second:numbers) {
                System.out.println(first +" , "+ second);
            }
        }
    }
}
