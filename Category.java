import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Category {
    protected String idC;
    protected String NameC;
   public Category(){

   }
   public Category(String idC,String NameC){
       this.idC=idC;
       this.NameC=NameC;
   }
   public String getIdC() {
       return idC;
   }
   public void setIdC(String idC) {
       this.idC = idC;
   }
   public void setNameC(String nameC) {
       NameC = nameC;
   }
   public String getNameC() {
       return NameC;
   }
    @Override
   public String toString(){
    return String.format("%5s%20s", idC,NameC);
   }
   public String toStringDoc(){
    String tmp=idC+";"+NameC;
    return tmp;
   }
   public static Category SearchId(Category TheLoai[],String a){
    for(Category x : TheLoai){
         if(x.getIdC().equals(a)){
           
          return x;
         }
    }
      return null;
  }
  public static Category[] addElementCategory(Category[] theLoai, Category tmp) {
    Category[] array = new Category[theLoai.length + 1];
    System.arraycopy(theLoai, 0, array, 0, theLoai.length);
    array[theLoai.length] = tmp;
    return array;}
       public static Category[] DocGhiDuLieuTheLoai(boolean a,Category TheLoai[]){
        //true: ghi
        int slTheLoai;

        if(a){
   try {

    FileWriter fw =new FileWriter("./data/category.txt");
    BufferedWriter bw =new BufferedWriter(fw);
               bw.write(""+TheLoai.length);
               bw.newLine();
              for(Category t:TheLoai){
                // bw.write(t.toString());
               bw.write(t.getIdC()+";"+t.getNameC());
               bw.newLine();
              }
              bw.close();
              fw.close();
        } catch (Exception e) {
        }
        }
        else{
               try {
                FileReader fr=new FileReader("./data/category.txt");
                BufferedReader br =new BufferedReader(fr);
                String line="";
                slTheLoai = Integer.parseInt(br.readLine());                while(true){
                  
                    line=br.readLine();
                    if(line ==""){
                        break;
                    }
                    String txt[]=line.split(";");
                    String id=txt[0];
                    String name=txt[1]; 
                    Category tmp=new Category(id, name);
                    TheLoai=Category.addElementCategory(TheLoai, tmp);
                                    }
                                    br.close();
                                    fr.close();
                            } catch (Exception e) {
                               
                            }
                            }
                        return TheLoai;
                        }
}
