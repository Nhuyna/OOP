
import java.util.Calendar;

public abstract  class People {
    protected  String id;
    protected  String name;
    protected Calendar birthdayDate;
    protected String address;
    public People(){

    }
    public People(String id,String name, Calendar birthDate,String address){
        this.id=id;
        this.name=name;
        this.birthdayDate=birthDate;
        this.address=address;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthdayDate(Calendar birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getAddress() {
        return address;
    }

    public Calendar getBirthdayDate() {
        return birthdayDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void NhapGhiDL(boolean a,People DS){
        
    }
    public String toString(){
        String NgaySinh=birthdayDate.get(Calendar.DATE)+"/"+birthdayDate.get(Calendar.MONTH)+"/"+birthdayDate.get(Calendar.YEAR);
        return String.format("%5s%15s%15s%20s",id,name,NgaySinh,address);
    }
    //Nhập abstract;
    //Sửa thông thông tin
    
}
