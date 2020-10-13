package collections;

import oopLecture.Post;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {
    public static void main(String[] args) {

        hashMapsPractice();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Post> posts = new ArrayList<>();

        System.out.println(names.size());
        names.add("Fernando");
        System.out.println(names.size());
        names.add("Daniel");
        names.add("Kenneth");

        posts.add(new Post("Fer's weekend", "Fer"));
        posts.add(new Post("Fer's 2nd weekend", "Ana"));
        posts.add(new Post("Ryan's latest weekend", "Ryan"));

        System.out.println("names.get(0) = " + names.get(0));
//        System.out.println("names.get(1) = " + names.get(1));
//        System.out.println("names.indexOf(\"Kenneth\") = " + names.indexOf("Kenneth"));
        if (names.contains("Fernando")) {
            System.out.println("names.get(2) = " + names.get(names.indexOf("Fernando")).toUpperCase());
        }

        Post deletedPost = posts.remove(1);
        deletedPost.printTitleAndAuthor();
        System.out.println("posts.lastIndexOf(deletedPost) = " + posts.lastIndexOf(deletedPost));

        if(!posts.isEmpty()){
            for (Post post: posts) {
                post.printTitleAndAuthor();
            }
        }

    }

    public static void hashMapsPractice(){
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("fmendozaro", "Fernando M R");
        usernames.putIfAbsent("fmendozaro", "Fernando Mendoza R");
        usernames.put("zgulde", "Zach Gulde");
        usernames.put("zguldes", "Zach Gulde");

        System.out.println("usernames.get(\"fmendozaro\") = " + usernames.get("fmendozaro"));
        System.out.println("usernames.get(\"ryanorsinger\") = " + usernames.getOrDefault("ryanorsinger", "N/A"));

        if(usernames.containsKey("ryanorsinger")){
            System.out.println("usernames.get(\"ryanorsinger\") = " + usernames.get("ryanorsinger"));
            System.out.println("Login into the system");
        } else{
            System.out.println("User not found");
            System.out.println("Roll back transaction");
            System.out.println("Ask again");
        }

        System.out.println("usernames.containsValue(\"Fernando M R\") = " + usernames.containsValue("Fernando M R"));
        System.out.println("usernames.containsValue(\"Fernando M Rs\") = " + usernames.containsValue("Fernando M Rs"));






    }

    // just for teaching purposes
//    public static ArrayList<Post> myOwnAdd(String title, ArrayList<String> authors){
//        ArrayList<Post> posts = new ArrayList<>();
//        posts.add(new Post(title, authors));
//        return posts;
//    }
}
