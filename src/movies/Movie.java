package movies;

public class Movie {

    private String name;
    private String category;

    // rules to create movies: having 2 params
    public Movie(String aName, String aCategory){
        this.name = aName;
        this.category = aCategory;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public void setCategory(String aCategory){
        this.category = aCategory;
    }

}
