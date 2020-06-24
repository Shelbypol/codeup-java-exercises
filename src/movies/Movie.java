package movies;

public class Movie {

    //==========PRIVATE FIELDS
    private String name;
    private String category;

    //=======GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String c) {
        this.category = c;
    }

    //========CONSTRUCTOR
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Little Mermaid", "Classic");
        System.out.println(m1.name);

    }

}
