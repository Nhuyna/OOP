import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Authors {
    protected String idA;
    protected String name;
    public Authors(){

    }
    public Authors(String idA,String name){
        this.idA=idA;
        this.name=name;
    }

    public void setIdA(String idA) {
        this.idA = idA;
    }

    public String getIdA() {
        return idA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return String.format("%5s%20s",idA,name);
    }

   
    public static Authors SearchIdA(Authors authors[],String a){
      for(Authors x:authors){
           if(x.getIdA().equals(a)){ 
            return x;
           }
      }
        return null;
    }
    public static Authors[] addElementAuthors(Authors[] TacGia, Authors tmp) {
        Authors[] array = new Authors[TacGia.length + 1];
        System.arraycopy(TacGia, 0, array, 0, TacGia.length);
        array[TacGia.length] = tmp;
        return array;}

     public static Authors[] DocGhiDuLieuTacGia(boolean a,Authors TacGia[]){
        //true: ghi
        int slTacGia;
     
        if(a){
            System.out.println("SoLuongTacGiala: "+TacGia.length);
   try {
    FileWriter fw =new FileWriter("./data/NhanVien.txt");
    BufferedWriter bw =new BufferedWriter(fw);
              for(Authors t:TacGia){
                // bw.write(t.toString());
               bw.write(t.getIdA()+";"+t.getName());
               bw.newLine();
              }
              bw.close();
              fw.close();
        } catch (Exception e) {
        }
        }
        else{
               try {
                FileReader fr=new FileReader("./data/Authors.txt");
                BufferedReader br =new BufferedReader(fr);
                String line="";
                slTacGia = Integer.parseInt(br.readLine());               
                 while(true){
                  
                    line=br.readLine();
                    if(line ==""){
                        break;
                    }
                    String txt[]=line.split(";");
                    String id=txt[0];
                    String name=txt[1]; 

                  
                    Authors tmp=new Authors(id, name);
                  
                    TacGia=Authors.addElementAuthors(TacGia, tmp);
                                    }
                                    br.close();
                                    fr.close();
                            } catch (Exception e) {
                                System.out.println("Không tìm thấy file");
                            }
                            }
                        return TacGia;
                        }
    
}
