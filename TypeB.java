public class TypeB extends LBCard {
    protected String idC;
    protected NguoiMuon nguoiMuon;
    protected int SLSM=5;
    protected int ThoiHanMuon=15;
    public TypeB(String idC,NguoiMuon nguoiMuon){
        super(idC, nguoiMuon);
    }
    @Override
    public int PhiMuon(int sl) {
        return (sl<SLSM)?10000:15000;
    }

    @Override
    public String TypeCard() {
        // TODO Auto-generated method stub
        return "B";
    }
}
