import java.util.Scanner;

public interface QLSach extends MenuQLTV{
    @Override
    public void InThongTin();
       

    @Override
    public default void NhapThongTin() {
              Books[] add=new Books[0];
          Books tmp=new Books();
          Books ds[]=new Books[0];
          ds= Books.DocGhiDuLieuSach(false,ds);
          System.out.println("Nhập số lượng sách cần nhập");
          Scanner sc=new Scanner(System.in);
          int n=Integer.parseInt(sc.nextLine());
          for(int i=0;i<n;i++){
            //Hàm nhập thông tin sách
          }
    }
      }
