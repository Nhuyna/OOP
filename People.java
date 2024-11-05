
import java.util.Date;

public class People {
    protected  String id;
    protected  String name;
    protected Date birthdayDate;
    protected String address;
    public People(){

    }
    public People(String id,String name, Date birthDate,String address){
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

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    //Nhập abstract;
    //Sửa thông thông tin
    
}
