public class TypeA extends LBCard{
    protected int SLSM=10;
    protected int ThoiHanMuon=30;
    //Số sách đã mượn trong tháng
    //SỐ lượng sách đang mượn
    @Override
    public int PhiMuon(int sl) {
        return (sl<SLSM)?8000:13000;
    }

    @Override
    public String TypeCard() {
        // TODO Auto-generated method stub
        return "A";
    }

   
}
