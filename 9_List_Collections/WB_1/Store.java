package WB_1;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        movies = new ArrayList<>();
    }

    public Movie getMovie(int index) {
        if (0 <= index && index < movies.size()){
            return new Movie(movies.get(index));
        } 
        return null;
    }

    public void setMovie(int index, Movie movie) {
        if (0 <= index && index < movies.size()){
            movies.set(index, new Movie(movie));
        }
    }

    public void addMovie(Movie movie) {
        movies.add(new Movie(movie));
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}