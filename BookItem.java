



public class BookItem {
    protected String idBIteam;
    protected Books Book;
    protected boolean situation;
    protected Location location;
   public BookItem(){

   }
   public BookItem(String idBItem,Books Book, boolean situation,Location location){
     this.idBIteam=idBItem;
     this.Book=Book;
     this.situation=situation;
     this.location=location;
   }

    public void setIdBIteam(String idBIteam) {
        this.idBIteam = idBIteam;
    }

    public String getIdBIteam() {
        return idBIteam;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setLocation() {
        if(situation==false){
            this.location=null;
        }
    }
    
    public Books getBook() {
        return Book;
    }

    public void setBook(Books Book) {
        this.Book = Book;
    }
    public void setSituation(boolean situation) {
        this.situation = situation;
    }

     public boolean getSituation(){
        return situation;
     }    
   
    @Override
   public String toString(){
   
    return String.format("%5s%10s%10s%10s", getIdBIteam(),getBook().getName(),getSituation(),(getSituation())?location.toString():"null");
   }
   public static BookItem[] addElementBookItem(BookItem[] Sach, BookItem tmp) {
    BookItem[] array = new BookItem[Sach.length+1];
    System.arraycopy(Sach, 0, array, 0, Sach.length);
    array[Sach.length] = tmp;
    return array;}
}
