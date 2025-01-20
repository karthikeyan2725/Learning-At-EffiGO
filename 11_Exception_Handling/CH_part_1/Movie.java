public class Movie {
    
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name == null){
            throw new IllegalArgumentException("Invalid Name Passed as input");
        }
        this.name = name;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (name.isBlank() || name == null){
            throw new IllegalArgumentException("Invalid Name Passed as input");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (0 <= rating && rating < 11){
            throw new IllegalArgumentException("Rating not valid");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }    

}