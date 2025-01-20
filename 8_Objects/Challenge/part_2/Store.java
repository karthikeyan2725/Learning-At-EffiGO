package part_2;
import java.util.Arrays;

public class Store {

    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        if (0 <= index && index < 10){
            return new Movie(movies[index]);
        }
        return null;
    }

    public void setMovie(int index, Movie movie) {
        if (0 <= index && index < 10){
            movies[index] = new Movie(movie);
        }
    }


    public String toString() {
        String temp = "";
        System.out.println(Arrays.toString(movies));

        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
