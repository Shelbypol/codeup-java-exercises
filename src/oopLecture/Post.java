

package oopLecture;
import java.util.Date;

public class Post {

    public static String nameOfBlog = "Deena's Blog";
    public static int numOfBlogViews = 1123;

    //instance
    public int nomOfPostViews;
    public Date createdAt;
    public Date editedAt;
    public String title;
    public String content;
    public String category;
    public Person author;

    //instance method
    public void printSummary(){
        System.out.printf("Title: %s%nContent: %s", this.title, this.content);
    }

    //static method ex:
    public static String returnLongerPostTitle(Post p1, Post p2){
         if(p1.title.length() > p2.title.length()){
             return p1.title;
         }else{
             return p2.title;
         }
    }

    public static void main(String[] args) {

        Post post1 = new Post();
        post1.title = "Name One";

        Post post2 = new Post();
        post1.title = "Name Longer";

        String longerTitle = returnLongerPostTitle(post1, post2);
        System.out.println(longerTitle);
    }


}
