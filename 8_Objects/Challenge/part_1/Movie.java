package part_1;
public class Movie {
    private String name;
    private String format;
    private double rating;
    
    public Movie(String name, String format, double rating){
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public String toString(){
        return "Name : " + name + ", Format : " + format + ", Rating : " + rating;
    }
}
