
public class Books {
    protected String id;
    protected String name;
    protected Authors Author;
    protected Category category;
    public Books (){

    }
    public Books(String id,String name,Authors Author,Category category){
        this.id=id;
        this.name=name;
        this.Author=Author;
        this.category=category;

    }
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public Authors getAuthor() {
        return Author;
    }
public void setAuthor(Authors Author) {
    this.Author = Author;
}
   
    public String getName() {
        return name;
    }
   public void setName(String name) {
       this.name = name;
   } 
   public String toString(Books book){
    return String.format("%20s%20s%20s",book.getName(),book.getAuthor().getName(),book.getCategory().getNameC());
   }
}
