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
    
}
