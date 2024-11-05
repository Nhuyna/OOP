

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
}
