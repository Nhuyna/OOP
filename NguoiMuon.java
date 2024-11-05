import java.util.Date;

public class NguoiMuon extends People {
    protected LBCard card;
    public NguoiMuon(){

    }
    public NguoiMuon(String id,String name, Date birthDate,String address,LBCard  card){
        super(id, name, birthDate, address);
        this.card=card;
    }
    
    //Nhập 
    //Xuất
    //Chỉnh Sửa
    
}
