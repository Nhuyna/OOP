
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
public class TTMuon {
    String idMuon;
    LBCard TheMuon;
    Calendar NgayMuon;
    Calendar HanMuon;
    BookItem SachMuon;
    boolean TrangThai;
    public TTMuon(){

    }
    public TTMuon(String idMuon,LBCard TheMuon,Calendar NgayMuon,Calendar HanMuon,BookItem SachMuon,boolean TrangThai){
        this.idMuon=idMuon;
        this.TheMuon=TheMuon;
        this.NgayMuon=NgayMuon;
        this.HanMuon=HanMuon;
        this.SachMuon=SachMuon;
        this.TrangThai=TrangThai;
    }
    public void setHanMuon(Calendar hanMuon) {
        HanMuon = hanMuon;
    }
    public void setIdMuon(String idMuon) {
        this.idMuon = idMuon;
    }
    public void setNgayMuon(Calendar ngayMuon) {
        NgayMuon = ngayMuon;
    }
    public void setSachMuon(BookItem sachMuon) {
        SachMuon = sachMuon;
    }
    public void setTrangThai(boolean trangThai) {
        TrangThai = trangThai;
    }
    @Override
    public String toString(){
        return String.format("%5s%15s%15s%15s%8s%35s%18s",idMuon,TheMuon.nguoiMuon.getName(),QLTV.toStringNgay(NgayMuon),QLTV.toStringNgay(HanMuon),SachMuon.idBIteam,SachMuon.Book.name,(TrangThai)?"Đang được mượn":"Đã trả");
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
                           //Đọc dữ liệu BookItem
                            BookItem Sach[]=new BookItem[0];
                  
                            Sach=QLSach.DocGhiDuLieuChiTietSach(a,Sach);            
                           //Đọc dữ liệu thẻ Mượn
                            LBCard DSTM[]=new LBCard[0];
                            DSTM=LBCard.DocGhiDL(false, DSTM);
                            while(true){
                               line=br.readLine();
                               if(line ==""){
                                   break;
                               }
                               String txt[]=line.split(";");
                               String id=txt[0];
                               String idTM=txt[1];
                               String linetmp=txt[2];
                               String linetmp2=txt[3];
                               String idSachMuon=txt[4];
                               boolean TrangThai= Boolean.parseBoolean(txt[5]);
                      
                               String t[]=linetmp.split("/"); 
                               Calendar NgayMuon=QLTV.LayNgay(t);
                               String t2[]=linetmp2.split("/");
                               Calendar HanMuon=QLTV.LayNgay(t);
                               BookItem SachMuon=BookItem.SearchId(Sach, idSachMuon);
                               LBCard TheMuon=LBCard.SearchId(DSTM,idTM);
                               TTMuon tmp=new TTMuon(id,TheMuon,NgayMuon,HanMuon,SachMuon,TrangThai);
                               DSM =TTMuon.addElementTTMuon(DSM, tmp); 
                               
                            
                                               }
                                               br.close();
                                               fr.close();
                                       } catch (Exception e) {
                                           
                                       }
                                       }
          
                              
          
      return DSM;
    }
    public static TTMuon[] addElementTTMuon(TTMuon[] DSM, TTMuon tmp) {
        TTMuon[] array = new TTMuon[DSM.length+1];
        System.arraycopy(DSM, 0, array, 0, DSM.length);
        array[DSM.length] = tmp;
        return array;}
    
        public static TTMuon SearchId(TTMuon DS[],String a){
            for(TTMuon x : DS){
                 if(x.idMuon.equals(a)){
                   
                  return x;
                 }
            }
              return null;
          }
}
