import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class QLSach  implements  QLTV{
    @Override
    public void InThongTin(){
    //Đọc dữ liệu thể loại
      Category []tmp=new Category[0];
      tmp=DocGhiDuLieuTheLoai(false,tmp);

    //Đọc dữ liệu tác giả
      Authors []tmpA=new Authors[0];
      tmpA=DocGhiDuLieuTacGia(false,tmpA);

      //in thôngtin sach

       
      
    }
        public static Authors[] DocGhiDuLieuTacGia(boolean a,Authors TacGia[]){
        //true: ghi
        int slTacGia;
     
        if(a){
            System.out.println("SoLuongTacGiala: "+TacGia.length);
   try {
    FileWriter fw =new FileWriter("./data/NhanVien.txt");
    BufferedWriter bw =new BufferedWriter(fw);
              for(Authors t:TacGia){
                // bw.write(t.toString());
               bw.write(t.getIdA()+";"+t.getName());
               bw.newLine();
              }
              bw.close();
              fw.close();
        } catch (Exception e) {
        }
        }
        else{
               try {
                FileReader fr=new FileReader("./data/Authors.txt");
                BufferedReader br =new BufferedReader(fr);
                String line="";
                slTacGia = Integer.parseInt(br.readLine());               
                 while(true){
                  
                    line=br.readLine();
                    if(line ==""){
                        break;
                    }
                    String txt[]=line.split(";");
                    String id=txt[0];
                    String name=txt[1]; 

                  
                    Authors tmp=new Authors(id, name);
                  
                    TacGia=Authors.addElementAuthors(TacGia, tmp);
                                    }
                                    br.close();
                                    fr.close();
                            } catch (Exception e) {
                                System.out.println("Không tìm thấy file");
                            }
                            }
                        return TacGia;
                        }
        public static Category[] DocGhiDuLieuTheLoai(boolean a,Category TheLoai[]){
        //true: ghi
        int slTheLoai;

        if(a){
   try {

    FileWriter fw =new FileWriter("./data/category.txt");
    BufferedWriter bw =new BufferedWriter(fw);
               bw.write(""+TheLoai.length);
               bw.newLine();
              for(Category t:TheLoai){
                // bw.write(t.toString());
               bw.write(t.getIdC()+";"+t.getNameC());
               bw.newLine();
              }
              bw.close();
              fw.close();
        } catch (Exception e) {
        }
        }
        else{
               try {
                FileReader fr=new FileReader("./data/category.txt");
                BufferedReader br =new BufferedReader(fr);
                String line="";
                slTheLoai = Integer.parseInt(br.readLine());                while(true){
                  
                    line=br.readLine();
                    if(line ==""){
                        break;
                    }
                    String txt[]=line.split(";");
                    String id=txt[0];
                    String name=txt[1]; 
                    Category tmp=new Category(id, name);
                    TheLoai=Category.addElementCategory(TheLoai, tmp);
                                    }
                                    br.close();
                                    fr.close();
                            } catch (Exception e) {
                               
                            }
                            }
                        return TheLoai;
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
                 tmp=DocGhiDuLieuTheLoai(false,tmp);

               //Đọc dữ liệu tác giả
                 Authors []tmpA=new Authors[0];
                 tmpA=DocGhiDuLieuTacGia(false,tmpA);        
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
                
                          Sach=QLSach.DocGhiDuLieuSach(false,Sach);            
                         //Đọc dữ liệu vị trí
                                Location ViTri[]=new Location[0];
                                ViTri=QLSach.DocGhiDuLieuViTri(false, ViTri);
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

        public static Location[] DocGhiDuLieuViTri(boolean a,Location ViTri[]){
        
          if(a){
             
            // try {
            //  FileWriter fw =new
            //   FileWriter("./data/BookItem.txt");
            //  BufferedWriter bw =new BufferedWriter(fw);
            //            bw.write(""+ViTri.length);
            //            bw.newLine();
            //            for(Location t:ViTri){
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
                          int sl;
                         FileReader fr=new FileReader("./data/Location.txt");
                         BufferedReader br =new BufferedReader(fr);
                         String line="";
                         sl = Integer.parseInt(br.readLine());                         
                          while(true){
                             line=br.readLine();
                             if(line ==""){
                                 break;
                             }
                             String txt[]=line.split(";");
                             String id=txt[0];
                             String kv=txt[1];
                             String ke=txt[2];
                             String hang=txt[3];
                             Location c=new Location(id,kv,ke,hang);
                                //  System.out.println(Authors.SearchIdA(tmpA, author).getName());
                                //  System.out.println(c.toString());
                             ViTri=Location.addElementLocation(ViTri, c);
                                  
                                             }
                                             br.close();
                                             fr.close();
                                     } catch (Exception e) {
                                         
                                     }
                                     }
        
                                 return ViTri;
        }
      }
