

public class BookItem {
    protected String idBIteam;
    protected Books Book;
    protected boolean situation;
    protected String location;
   public BookItem(){

   }
   public BookItem(String idBItem,Books Book, boolean situation,String location){
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

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
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
   
   public String toString(){
    
    return String.format("%5s%20s%20s%20s",idBIteam,Book.getName(),(situation)?"Còn":"Đang được mượn",location);
   }
}
