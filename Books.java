
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Books{
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

              public static Books[] DocGhiDuLieuSach(boolean a,Books[] Sach){
          
        
         if(a){
             
    try {
     FileWriter fw =new
      FileWriter("./data/Books.txt");
     BufferedWriter bw =new BufferedWriter(fw);
               bw.write(""+Sach.length);
               bw.newLine();
               for(Books t:Sach){
                 // bw.write(t.toString());
                
                bw.write(t.id+";"+t.name+";"+t.Author.idA+";"+t.category.idC);
                bw.newLine();
               }
               bw.close();
               fw.close();
         } catch (Exception e) {
         }
          
         }
         else{
                try {
                  int slSach;
                 FileReader fr=new FileReader("./data/Books.txt");
                 BufferedReader br =new BufferedReader(fr);
                 String line="";
                 slSach = Integer.parseInt(br.readLine());                      
                 Category []tmp=new Category[0];
                 tmp=Category.DocGhiDuLieuTheLoai(false,tmp);

               //Đọc dữ liệu tác giả
                 Authors []tmpA=new Authors[0];
                 tmpA=Authors.DocGhiDuLieuTacGia(false,tmpA);        
                  while(true){
                     line=br.readLine();
                     if(line ==""){
                         break;
                     }
                     String txt[]=line.split(";");
                     String id=txt[0];
                     String name=txt[1];
                     String author=txt[2];
                     String category=txt[3];
                         Category y=Category.SearchId(tmp, category);
                         Authors x=Authors.SearchIdA(tmpA, author);
                         Books c=new Books(id, name,x,y);
                        //  System.out.println(Authors.SearchIdA(tmpA, author).getName());
                        //  System.out.println(c.toString());

                     Sach=Books.addElementBooks(Sach, c);
                   
                                     }
                                     br.close();
                                     fr.close();
                             } catch (Exception e) {
                                 
                             }
                             }
                            
                           

                         return Sach;
        }
    public void NhapThongTin() {
          //1 cuốn
          Books tmp=new Books();
 
    }

    public void InThongTin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

