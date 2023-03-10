package Streams;

public class Movie {

    private String name;
    private int likes;
    private Genre genre;

    public Movie(String name, int likes, Genre genre) {
        this.name = name;
        this.likes = likes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", likes=" + likes +
                '}';
    }
}
