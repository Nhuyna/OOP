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
    
}
