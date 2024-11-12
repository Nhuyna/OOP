import java.util.Calendar;
import java.util.Scanner;

public interface QLTV extends MenuQLTV{
  //Mặc định public, abstract
  // public void NhapDuLieu();
  // public void LuuDuLieu();
  // public void NhapThongTin();
   public default void InThongTin(){
    int choice =0;
    Scanner  sc=new Scanner(System.in);
    while (choice==0) {
      System.out.println("Bạn muốn: ");
      System.out.println("1. In thông tin thẻ thư viện:"); 
      System.out.println("2.In thông tin nhân viên");
      System.out.println("3.In thông tin người mượn");
      System.out.println("4. In thông tin sách"); 
      choice=Integer.parseInt(sc.nextLine());  
       if(choice==2){//test
          QLSach a=new QLSach();
          a.InThongTin();  
       }  } 
    
    }
 
         public static Calendar LayNgay(String str[]){
      Calendar Ngay=Calendar.getInstance();
      Ngay.set(Calendar.DAY_OF_YEAR,Integer.parseInt(str[0]));
      Ngay.set(Calendar.MONTH,Integer.parseInt(str[1]));
      Ngay.set(Calendar.YEAR, Integer.parseInt(str[2]));
      return Ngay;
    }
    public static String toStringNgay(Calendar Ngay){
      String str;
      str=Ngay.get(Calendar.DAY_OF_MONTH)+"/"+Ngay.get(Calendar.DAY_OF_MONTH)+"/"+Ngay.get(Calendar.YEAR);
      return str;
    }
   }
       //Xoá sách - ktra xem sách đó có trong thư viện không ->Xoá
       //Add bookitem-> kiểm tra xem book cần nhập có trong danh sách sách không->có thì thêm
       //không có thì hỏi? Tựa sách này chưa có trong thư viện, Bạn có muốn thêm không? Có nhập tựa sách(book) , thêm bookitem
       //Mượn sách-> Tìm kiếm sách-> hiện list sách đã tìm kiếm được-> Chọn sách -> Kiểm tra xem còn số lượng không->Còn thì hiện list bookitem của cuốn sách đó, yêu cầu người dùng chọn bookitem
         //Mượn->Kiểm tra thẻ thư viện của người dùng loại gì, check xem còn số lượng được mượn hay không
         //Còn thì cho mượn, id chitietmuon random 6 chữ số , không còn thì check xem thẻ loại gì-> Nâng cấp thẻ
         //Không nâng cấp thẻ mà vẫn muốn mượn thì phí mượn là 20k
         //Quản lí tổng thu trong tháng
         //Quản lí sách đang được cho Mượn

         //Chức năng của nhân viên: Xoá sách, Thêm sách,Chỉnh sửa thông tin sách,Chỉnh sửa thông tin đọc giả
         //Chức năng của Đọc giả:Mượn sách,Trả Sách,Chưa có thẻ thư viện thì tạo thẻ,Xoá thẻ,Góp sách,
         //Trong đó xem chi tiết đầu sách đó có tổng cộng bao nhiêu cuốn, bao nhiêu cuốn đang có trong thư viện(situation=1),bao nhiêu cuốn đang được cho mượn(situation=0)
         //Mượn sách: Ngày mượn, tuỳ theo thẻ sẽ có ngày được mượn khác nhau, Gia hạn mượn sách khác nhau
         //Trả sách: Check tình trạng sách có bị gì không
         
        

