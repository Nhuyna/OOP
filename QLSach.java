
class QLSach implements MenuQLTV {
    

    @Override
    public void NhapThongTin() {
         //Kiểu dữ liệu
         Books DSS[]=new Books[0];
         DSS= Books.NhapDL();
         for(Books tmp:DSS){
          System.out.println(tmp.toString());
         }
         Books.DocGhiDuLieuSach(true, DSS);
           
    }
      }
   

  