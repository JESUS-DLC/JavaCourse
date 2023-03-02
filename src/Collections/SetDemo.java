package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        /*Un conjunto en Java es una colección de elementos que,
        como el conjunto en matemáticas, no permite elementos duplicados
        dentro de ella y no tiene orden entre sus elementos.*/

        Set<String> videogames = new HashSet<>();
        videogames.add("FIFA");
        videogames.add("GTA");
        videogames.add("GTA");
        videogames.add("Titan fall");
        System.out.println(videogames);

        ArrayList<String> games = new ArrayList<>();
        games.add("FIFA");
        games.add("GTA");
        games.add("GTA");
        games.add("Titan fall");
        Set<String> gamesSet = new HashSet<>(games);
        System.out.println(gamesSet);

        Set<String> letterSet = new HashSet<>(Arrays.asList("A","B","C"));
        System.out.println(letterSet);
    }
}
