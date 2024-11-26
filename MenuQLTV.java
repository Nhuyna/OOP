
import java.util.Scanner;



public interface  MenuQLTV {
   public  void NhapThongTin();
   public static  void InThongTin(){

      System.out.println("Chọn chế độ: ");
      System.out.println("1. Thủ thư: ");
      //1 6
      System.out.println("2. Người mượn sách");
      Scanner sc=new Scanner(System.in);
      int c= Integer.parseInt(sc.nextLine());
      if(c==1){
         while (true) {    
         System.out.println("1.Nhập sách mới");
         System.out.println("2.Nhập thẻ cho người mới");
         System.out.println("3.Sửa thông tin sách");
         System.out.println("4.Sửa thông tin người mượn");
         System.out.println("5.Sửa chi tiết sách(kệ,trạng thái)");
         System.out.println("6.Xoá dữ liệu sách");
         System.out.println("7.Xoá dữ liệu chi tiết sách");
         System.out.println("8.Thống kê số liệu");
         System.out.println("9.Tìm kiếm sách(tên)");
         System.out.println("0.Thoát");
         int d=Integer.parseInt(sc.nextLine());
         switch (d) {
            case 1:
             QLSach a=new QLSach();
             a.NhapThongTin();
               
                  

         break;

             case 3:
                   { //Tìm kiếm sách cần sửa
                    Books []tmp=new Books[0];
                    Books book=new Books();
                    System.out.println("Nhap id sach can sua:");
                    
                    Books.SearchId(tmp, "1234");
                   }

                 break;
            case 6:
                //Xoa du lieu sach
                {
                  Books []tmp=new Books[0];

                  tmp=Books.DocGhiDuLieuSach(false, tmp);
                  System.out.println("Nhap id sach can xoa");
                  String strid=sc.nextLine();
                  
                  Books []output=new Books[0];
                  System.out.println("Du lieu sau khi xoa la:");
                  output=Books.removeBooks(tmp, strid);
                  Books.DocGhiDuLieuSach(true,output);
                  System.out.println("Xoa sach thanh cong");
                  
                }
               
                
             default:
                 throw new AssertionError();
         }
      }
      }
      else if(c==2){
         System.out.println();
         System.out.println("1.Tìm kiếm sách");
         System.out.println("2.Mượn sách");
         System.out.println("3.Trả sách");
         System.out.println("4.Xem thông tin cá nhân");
         System.out.println("5.Xem danh sách các thể loại đang có trong thư viện");
         System.out.println("6.Xem danh sách các cuốn sách dựa trên mã/tên thể loại");

      }
      else{ 

      }
      //   System.out.println("Chọn thông tin cần in");
      //   System.out.println("1.Danh sách thể loại");
      //   System.out.println("2.In các đầu sách đang có trong thư viện");
      //   System.out.println("3.In danh sách các tác giả");
        
   }
      
   

   
   public default MenuQLTV SuaThongTin(MenuQLTV a){
     
      return a;
}
}
