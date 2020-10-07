package oopLecture;

import java.util.Date;

public class Post {

    // blog views
    public static int blogViews;

    // name of blog
    public static String nameOfBlog = "Justin's Blog";

    // title
    private String title;

    // getter for title
    public String getTitle() {
        return this.title.toUpperCase();
    }

    // setter for title
    public void setTitle(String title) {
        this.title = title.toLowerCase().trim();
    }

    // author
    public String authorName;

    // datePosted
    public Date datePosted;

    // content
    public String content;

    // dateEdited
    public Date dateEdited;

    // constructor

    public Post(String title) {
        this.title = title;
        this.authorName = "";
    }

    public Post(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
    }

    // display title and authorName
    public void printTitleAndAuthor() {
        System.out.println("The title is: " + this.title);
        System.out.println("The author is: " + this.authorName);
    }

    // method to return the longer title of two blog posts...
    public static String returnLongerPostTitle(Post p1, Post p2) {
        if (p1.title.length() > p2.title.length()) {
            return p1.title;
        } else {
            return p2.title;
        }
    }

    public static void main(String[] args) {
//        Post p = new Post();

//        p.title = "A Day in the Life";
//        p.content = "I am what I am.";
//        p.datePosted = new Date();
//        p.dateEdited = new Date();
//        p.authorName = "Max Smith";

//        p.printTitleAndAuthor();

    }

}
