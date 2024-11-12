
public class main {

    public static void main(String[] args) {
           
    // Books Sach[]=new Books[0];
    // Sach=QLSach.DocGhiDuLieuSach(false,Sach);
    // // System.out.println("hi");
    // // for(Books k:Sach){
    // //     System.out.println(k.toString());
    // // }
    // QLSach.DocGhiDuLieuSach(true,Sach);
    // Authors TacGia[]=new Authors[0];
    // TacGia= QLSach.DocGhiDuLieuTacGia(false,TacGia);
    // for(Authors a:TacGia){
    //     System.out.println(a.toString());
    // }   
//    QLSach.DocGhiDuLieuTacGia(true, TacGia);
//    Category TheLoai[]=new Category[0];
//   TheLoai= QLSach.DocGhiDuLieuTheLoai(false, TheLoai);
//    for(Category x:TheLoai){
//     System.out.println(x.toString());
//    }
//    TheLoai=QLSach.DocGhiDuLieuTheLoai(true, TheLoai);

      // Location a[]=new Location[0];
      // a=QLSach.DocGhiDuLieuViTri(false, a);
      // System.out.println("\n\n");
      // for(Location x : a){
      //   System.out.println(x.toString());
      // }

    //  BookItem b[]=new BookItem[0];
    //  b=QLSach.DocGhiDuLieuChiTietSach(false, b);
    //  for(BookItem x:b){
    //   System.out.println(x.toString());
    //  }
    
    // String line="05/2/2005";
    // String txt[]=line.split("/");
    // Calendar tmp=Calendar.getInstance();
    // tmp.set(Calendar.DAY_OF_MONTH,Integer.parseInt(txt[0]));
    // tmp.set(Calendar.MONTH, Integer.parseInt(txt[1]));
    // tmp.set(Calendar.YEAR, Integer.parseInt(txt[2]));
    // People a=new NhanVien("001","Nguyễn Văn A",tmp,"123abc",20,25000);
    
    // String str=String.format("%5s%5s%5s",a.getBirthdayDate().get(Calendar.DAY_OF_MONTH)+"/",a.getBirthdayDate().get(Calendar.MONTH)+"/",a.getBirthdayDate().get(Calendar.YEAR));
    // System.out.println(str);


//     NhanVien tmp[]=new NhanVien[0];
//    tmp= NhanVien.NhapGhiDL(false, tmp);
//     for(NhanVien t:tmp){
//         System.out.println(t.toString());
//     }
        
    // NguoiMuon tmp[]=new NguoiMuon[0];
    // tmp=NguoiMuon.NhapGhiDL(false, tmp);
    // for(NguoiMuon t:tmp){
    //     System.out.println(t.toString());
    // }

//     String line="05/2/2005";
//     String txt[]=line.split("/");
//     Calendar BD=Calendar.getInstance();
//     BD.set(Calendar.DAY_OF_MONTH,Integer.parseInt(txt[0]));
//     BD.set(Calendar.MONTH, Integer.parseInt(txt[1]));
//     BD.set(Calendar.YEAR, Integer.parseInt(txt[2]));
//    NguoiMuon a=new NguoiMuon("001","Nguyễn Văn A",BD,"123abc");
//     System.out.println("Nhập loại thẻ thư viện");
//     String tmp="A";
//     if(tmp=="A"){
//         LBCard N=new TypeA("123",a);
//          System.out.println(N.toString());
//     }
       LBCard DS[]=new LBCard[0];
     DS= LBCard.DocGhiDL(false,DS);
       for(LBCard x:DS){
        System.out.println(x.toString());
       }
    }
}

