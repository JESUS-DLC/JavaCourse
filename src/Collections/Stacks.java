package Collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> songs = new Stack<>();
        songs.push("down with me");
        songs.push("reptilia");
        songs.push("a mi");
        //System.out.println(songs.peek());
        songs.pop();
        //System.out.println(songs.peek());

        System.out.println(reverse("abcde"));

    }

    public static String reverse(String input){
        if(input==null)
            throw new IllegalArgumentException();

        Stack<Character> words = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            words.push(input.charAt(i));
        }

        StringBuffer wordReverse = new StringBuffer();

        while (!words.empty()){
            wordReverse.append(words.pop());
        }

        return wordReverse.toString();
    }

}
