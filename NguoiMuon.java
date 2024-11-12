import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;

public class NguoiMuon extends People {
    public NguoiMuon(){

    }
    public NguoiMuon(String id,String name, Calendar birthDate,String address){
        super(id, name, birthDate, address);
  
    }
    
    public static NguoiMuon[] NhapGhiDL(boolean a,NguoiMuon DS[]){
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
                
                FileReader fr=new FileReader("./data/NguoiMuon.txt");
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
                    String name=txt[1]; 
                    String linetmp=txt[2];
                    String t[]=linetmp.split("/");
                    Calendar NgaySinh= Calendar.getInstance();
                    NgaySinh.set(Calendar.DAY_OF_MONTH,Integer.parseInt(t[0]));
                    NgaySinh.set(Calendar.MONTH, Integer.parseInt(t[1]));
                    NgaySinh.set(Calendar.YEAR, Integer.parseInt(t[2]));
                    String address=txt[3];
               

                    NguoiMuon tmp=new NguoiMuon(id,name,NgaySinh,address);
                  
                    DS=NguoiMuon.addElementNguoiMuon(DS, tmp);
                                    }
                                    br.close();
                                    fr.close();
                            } catch (Exception e) {
                               
                            }
                            }
                        return DS;
                        
    }
    public static NguoiMuon[] addElementNguoiMuon(NguoiMuon DS[],NguoiMuon tmp){
        NguoiMuon[] array = new NguoiMuon[DS.length+1];
        System.arraycopy(DS, 0, array, 0, DS.length);
        array[DS.length] = tmp;
        return array;
    }
    public static NguoiMuon SearchId(NguoiMuon DS[],String a){
        for(NguoiMuon x : DS){
             if(x.getId().equals(a)){
               
              return x;
             }
        }
          return null;
      }
    
    //Nhập 
    //Xuất
    //Chỉnh Sửa
    
}
