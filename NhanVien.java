import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;

public class NhanVien extends People {
    protected int SoGioLam;
    protected int Luong;
    public NhanVien(){

    }
    public NhanVien(String id,String name, Calendar birthDate,String address,int SoGioLam,int Luong){
        super(id, name, birthDate, address);
        this.SoGioLam=SoGioLam;
        this.Luong=Luong;
    }
    public void setSoCaLam(int SoGioLam) {
        this.SoGioLam = SoGioLam;
    }
    public void setLuong(int Luong) {
        Luong = Luong;
    }
    public int TinhLuong(){
        return SoGioLam*Luong;
    }
   
    public static NhanVien[] NhapGhiDL(boolean a,NhanVien DS[]){
        int sl;
     
        if(a){
            // System.out.println("SoLuongTacGiala: "+TacGia.length);
//    try {
//     FileWriter fw =new FileWriter("./data/NhanVien.txt");
//     BufferedWriter bw =new BufferedWriter(fw);
//               for(NhanVien t:TacGia){
//                 // bw.write(t.toString());
//                bw.write(t.getIdA()+";"+t.getName());
//                bw.newLine();
//               }
//               bw.close();
//               fw.close();
//         } catch (Exception e) {
//         }
        }
        else{
               try {
                
                FileReader fr=new FileReader("./data/NhanVien.txt");
                BufferedReader br =new BufferedReader(fr);
                String line="";
                sl = Integer.parseInt(br.readLine());   
                System.out.println("ha");            
                 while(true){
                  System.out.println("hi");
                    line=br.readLine();
                    if(line ==""){
                        break;
                    }
                    String txt[]=line.split(";");
                    String id=txt[0];
                    String name=txt[1]; 
                    String linetmp=txt[2];
                    String t[]=linetmp.split("/");
                    Calendar NgaySinh= Calendar.getInstance();
                    NgaySinh.set(Calendar.DAY_OF_MONTH,Integer.parseInt(t[0]));
                    NgaySinh.set(Calendar.MONTH, Integer.parseInt(t[1]));
                    NgaySinh.set(Calendar.YEAR, Integer.parseInt(t[2]));
                    String address=txt[3];
                    int SGL=Integer.parseInt(txt[4]);
                    int Luong=Integer.parseInt(txt[5]);

                    NhanVien tmp=new NhanVien(id,name,NgaySinh,address,SGL,Luong);
                  
                    DS=NhanVien.addElementNhanVien(DS, tmp);
                                    }
                                    br.close();
                                    fr.close();
                            } catch (Exception e) {
                               
                            }
                            }
                        return DS;
                        
    }
    public static NhanVien[] addElementNhanVien(NhanVien DS[],NhanVien tmp){
        NhanVien[] array = new NhanVien[DS.length+1];
        System.arraycopy(DS, 0, array, 0, DS.length);
        array[DS.length] = tmp;
        return array;
    }
    public String toString(){
        String NgaySinh=birthdayDate.get(Calendar.DATE)+"/"+birthdayDate.get(Calendar.MONTH)+"/"+birthdayDate.get(Calendar.YEAR);
        return String.format("%5s%15s%15s%20s%5d%15d",id,name,NgaySinh,address,SoGioLam,Luong);
    }


}
