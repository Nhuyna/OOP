
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
    @Override
   public String toString(){
    return String.format("%4s%45s%23s%23s",id,name,Author.name,category.NameC);
   }
   public static Books[] addElementBooks(Books[] Sach, Books tmp) {
    Books[] array = new Books[Sach.length+1];
    System.arraycopy(Sach, 0, array, 0, Sach.length);
    array[Sach.length] = tmp;
    return array;}
    public static Books SearchId(Books DS[],String a){
        for(Books x : DS){
             if(x.getId().equals(a)){
               
              return x;
             }
        }
          return null;
      }
}
