



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
}
