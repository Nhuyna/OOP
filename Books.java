
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Books{
    protected String id;
    protected String name;
    protected Authors Author;
    protected Category category;

    public Books(String id,String name,Authors Author,Category category){
        this.id=id;
        this.name=name;
        this.Author=Author;
        this.category=category;

    }
    public Books(){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("ID sach: ");
        id = sc.nextLine();  
        Books dss[]=new Books[0];
        dss=DocGhiDuLieuSach(false, dss);
        if(Books.SearchId(dss, id)!=null){
            System.out.println("id vừa nhập đã tồn tại, vui lòng nhập id khác");
        }
       System.out.print("Ten sach: ");
        name = sc.nextLine();    
       System.out.print("ID tac gia: ");
        String authorId = sc.nextLine();
        Authors DSTG[]=new Authors[0];
             
      DSTG=  Authors.DocGhiDuLieuTacGia(false, DSTG);
    
     Author = Authors.SearchIdA( DSTG,authorId );      
     while(Author==null){
        System.out.println("Tác giả vừa nhập chưa được ghi nhận trong dữ liệu, vui lòng nhập thể loại khác hoặc nhập thông tin của tác giả này");
        int i=Integer.parseInt(sc.nextLine());
        if(i==2){
            System.out.println("Nhập thông tin tác giả mới");
        }
        else{
            System.out.print("ID tac gia: ");
            authorId = sc.nextLine();
            Author = Authors.SearchIdA( DSTG,authorId );  
        }

     }
       System.out.print("ID the loai: ");
       String  categoryId = sc.nextLine();
       Category TheLoai[]=new Category[0];  
      TheLoai=  Category.DocGhiDuLieuTheLoai(false, TheLoai);  
        for(Category tmp:TheLoai){
            System.out.println(tmp.toString());
        }
        category =   Category.SearchId(TheLoai, categoryId);
        while(category==null){
            System.out.println("Thể loại bạn vừa nhập không tồn tại trong cơ sở dữ liệu");
            System.out.println("1.Thêm thể loại mới vào cơ sở dữ liệu");
            System.out.println("2.Nhập lại thể loại khác");
            int i=Integer.parseInt(sc.nextLine());
            if(i==1){
                System.out.println("Nhập thể loại mới");
   
            }
            else{
                 System.out.print("ID the loai: ");
                 categoryId = sc.nextLine();
                 category=      Category.SearchId(TheLoai, id);
            }

        }
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

   public static Books[] DocGhiDuLieuSach(boolean a,Books[] Sach){
          
        
         if(a){
             
    try {
     FileWriter fw =new FileWriter("./data/Books.txt");
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


        // Tìm kiếm bằng tên
        public static Books findByName(Books[] Sach, String bookName) {
            for (Books x : Sach) {
                if (x.getName().equalsIgnoreCase(bookName)) {
                    return x;
                }
            }
            System.out.println("Khong tim thay sach.\n");
            return null;
        }
    public void InThongTin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
      public Books HamNhap(){
        Books tmp = new Books();
        System.out.println("Nhập tên sách");
        Scanner sc=new Scanner(System.in);
        tmp.setName(sc.nextLine());
        

        
        return tmp;
      }

      public static Books[] updateBook(Books[] Sach, Books id, Books newBooks) {
        boolean found = false;
        for (int i = 0; i < Sach.length; i++) {
            if (Sach[i].getId().equals(id)) {
                Sach[i] = newBooks;
                found = true;
                System.out.println("Da cap nhat thong tin sach cho ID: " + id);
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sach voi ID: " + id);
        }
        return Sach;
    }

    public static Books[] NhapDL() {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Nhập số lượng sách muốn thêm: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        Books DsSach[]=new Books[0];
        DsSach=DocGhiDuLieuSach(false, DsSach);
      
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin thứ: " + (i + 1) + ":");
            Books tmp=new Books();
            DsSach=addElementBooks(DsSach, tmp);
        }
        
       
        System.out.println("Nhap du lieu thanh cong!");
       return  DsSach;
    }   
    
    public static Books[] removeBooks(Books[] Sach, String id) {
        int index = -1;
        for (int i = 0; i < Sach.length; i++) {
            System.out.println(Sach[i].getId()+": "+id);
            if (Sach[i].getId().equals(id)) {
                index = i;
                break;
            }

        }

        if (index == -1) {
            System.out.println("Khong tim thay sach.\n");
            return Sach;
        }

        Books[] newArray = new Books[Sach.length - 1];
        System.arraycopy(Sach, 0, newArray, 0, index);
        System.arraycopy(Sach, index + 1, newArray, index, Sach.length - index - 1);
        System.out.println("Da xoa sach.\n");
        return newArray;
    }
}

