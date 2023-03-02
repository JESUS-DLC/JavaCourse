package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("m1", 10, Genre.ACTION),
                new Movie("m1.copy", 10, Genre.ACTION),
                new Movie("m2", 20, Genre.COMEDY),
                new Movie("m3", 30, Genre.COMEDY),
                new Movie("m4", 40, Genre.HORROR)
        );

        System.out.println("---PELICULAS CON 10 O MAS LIKES---");
        var c = movies.stream()
                .filter(movie -> movie.getLikes() >= 10)
                .count();
        System.out.println(c);

        System.out.println("---NUMEROS ALEATORIOS---");
        var stream = Stream.generate(Math::random);
        stream
                .limit(6)
                .forEach(System.out::println);

        System.out.println("---NOMBRES DE LAS PELICULAS---");
        movies.stream()
                .map(movie -> movie.getName().equals("ss"))
                .forEach(System.out::println);

        System.out.println("PELICULAS POPULARES CON PREDICATE");

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(System.out::println);

        System.out.println("ELEMENTOS UNICOS ");
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

        System.out.println("REDUCERS");

        boolean anyMatch = movies.stream()
                .anyMatch(movie -> movie.getLikes() > 10);
        System.out.println(anyMatch);

        System.out.println("NUMERO MAXIMO DE LIKES");

        Movie max = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(max);

        System.out.println("OBTENER AL TOTAL DE LIKES");
        int sum = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("CONVERTIR STREAM A LISTA");
        List<Integer> likes = movies.stream()
                .map(Movie::getLikes)
                .collect(Collectors.toList());

        System.out.println("AGRUPANDO POR GENERO");
        var result = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre ,Collectors.counting()));
        System.out.println(result);

        System.out.println("PARTICIONANDO");
        var partition = movies.stream()
                .collect(Collectors.partitioningBy(movie -> movie.getLikes()>10,
                        Collectors.mapping(Movie::getName,Collectors.joining(","))));

        System.out.println(partition);



    }
}
