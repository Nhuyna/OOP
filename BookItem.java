import java.io.BufferedReader;
import java.io.FileReader;

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
    public static BookItem SearchId(BookItem DS[],String a){
        for(BookItem x : DS){
             if(x.getIdBIteam().equals(a)){
               
              return x;
             }
        }
          return null;
      }

      public static BookItem[] DocGhiDuLieuChiTietSach(boolean a,BookItem CTSach[]){
        
          if(a){
             
            // try {
            //  FileWriter fw =new
            //   FileWriter("./data/BookItem.txt");
            //  BufferedWriter bw =new BufferedWriter(fw);
            //            bw.write(""+CTSach.length);
            //            bw.newLine();
            //            for(BookItem t:CTSach){
            //              // bw.write(t.toString());
                        
            //             bw.write(t.id+";"+t.name+";"+t.Author.idA+";"+t.category.idC);
            //             bw.newLine();
            //            }
            //            bw.close();
            //            fw.close();
            //      } catch (Exception e) {
            //      }
                  
                 }
                 else{
                        try {
                          int slCTSach;
                         FileReader fr=new FileReader("./data/BookItem.txt");
                         BufferedReader br =new BufferedReader(fr);
                         String line="";
                         slCTSach = Integer.parseInt(br.readLine());                      
                         //Đọc dữ liệu sách
                          Books Sach[]=new Books[0];
                
                          Sach=Books.DocGhiDuLieuSach(false,Sach);            
                         //Đọc dữ liệu vị trí
                                Location ViTri[]=new Location[0];
                                ViTri=Location.DocGhiDuLieuViTri(false, ViTri);
                                // for(Location l : ViTri){
                                //   System.out.println(l.toString());
                                // }
                          
                                int i=0;
                          while(true){
                             line=br.readLine();
                             if(line ==""){
                                 break;
                             }
                             String txt[]=line.split(";");
                             String id=txt[0];
                             String book=txt[1];
                             boolean situation= Boolean.parseBoolean(txt[2]);
                             String location=txt[3];
                             
                             
                                 Books x=Books.SearchId(Sach, book);
                                 Location y=(Location.SearchId(ViTri,location));
                                if(y==null){
                                  System.out.println("Tìm kh thấy"+i+++" " + location);
                                }
                                 BookItem c=new BookItem(id, x,situation,y);
                                //  System.out.println(Authors.SearchIdA(tmpA, author).getName());
                                  // System.out.println(c.idBIteam+"   "+c.getBook().name+"   "+c.situation+"  "+c.getLocation().toString());
        
                               CTSach=BookItem.addElementBookItem(CTSach, c);
                              //  System.out.println(c.idBIteam+"  "+c.getBook().name+"  "+c.situation + "  "+ c.location.toString());
                              //  System.out.println(c.toString());
                                             }
                                             br.close();
                                             fr.close();
                                     } catch (Exception e) {
                                         
                                     }
                                     }
        
                                 return CTSach;
        }

}
