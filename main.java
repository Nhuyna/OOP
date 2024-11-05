
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
//         Authors tg1=new Authors("123","Nguyễn Nhật Ánh");
//         Authors tg2=new Authors("456","Nam Cao");
//         Category tl1=new Category("111","Truyện ngắn");
//         Books sach=new Books("999","Tôi là Bêto",tg1,tl1);
//         String tmp=String.format("%5s%20s%20s%20s","Stt","Tên Sách","Tên tác giả","Thể loại");
//    System.out.println(tmp);

//        String tmp1=String.format("%5d",1,sach.getName(),sach.toString());
//        String tmp3=sach.toString(sach);
//        System.out.println(String.format("%5d", 1)+tmp3);
//     //    BookItem a=new BookItem("123",sach,true,"Kệ a,tầng 2");
//     BookItem a=new BookItem("123", sach, false, "ABC");
// System.out.println(a.toString());
     System.out.println(String.format("%50s%4s%s","-","MENU","-"));
     int choice=0;
     Scanner sc=new Scanner(System.in);
     while(choice==0){
           System.out.println("0.Thoát chương trình");
           System.out.println("1.Hiển thị danh sách các đầu sách trong thư viện");
           System.out.println("2.Hiển thị các thể loại đang có");
           System.out.println("3.Mượn sách");
           System.out.println("4.Trả sách");
           choice=Integer.parseInt(sc.nextLine());    
     }
    

    }
}

