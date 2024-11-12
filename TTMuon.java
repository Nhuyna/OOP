
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
public class TTMuon {
    String idMuon;
    Calendar NgayMuon;
    Calendar HanMuon;
    Books SachMuon;
    boolean TrangThai;

    public void setHanMuon(Calendar hanMuon) {
        HanMuon = hanMuon;
    }
    public void setIdMuon(String idMuon) {
        this.idMuon = idMuon;
    }
    public void setNgayMuon(Calendar ngayMuon) {
        NgayMuon = ngayMuon;
    }
    public void setSachMuon(Books sachMuon) {
        SachMuon = sachMuon;
    }
    public void setTrangThai(boolean trangThai) {
        TrangThai = trangThai;
    }
    public static TTMuon[] NhapGhiDL(boolean a,TTMuon DSM[]){
        
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
                            int sl;
                           FileReader fr=new FileReader("./data/TTMuon.txt");
                           BufferedReader br =new BufferedReader(fr);
                           String line="";
                           sl = Integer.parseInt(br.readLine());                      
                           //Đọc dữ liệu sách
                            Books Sach[]=new Books[0];
                  
                            Sach=QLSach.DocGhiDuLieuSach(false,Sach);            

                            while(true){
                               line=br.readLine();
                               if(line ==""){
                                   break;
                               }
                               String txt[]=line.split(";");
                               String id=txt[0];
                               String NgayMuon=txt[1];
                               String HanMuon=txt[2];
                               String idSachMuon=txt[3];
                               boolean TrangThai= Boolean.parseBoolean(txt[4]);
                              
                               
                                               }
                                               br.close();
                                               fr.close();
                                       } catch (Exception e) {
                                           
                                       }
                                       }
          
                              
          
      return DSM;
    }

}
