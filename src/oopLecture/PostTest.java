package oopLecture;

public class PostTest {
    public static void main(String[] args) {
        Post post = new Post("A Day in the Life", "Max Smith");
        System.out.println(post.getTitle());
        post.setTitle("Some Other Title");
        System.out.println(post.getTitle());
    }
}
