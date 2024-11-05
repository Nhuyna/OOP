public class TypeB extends LBCard {
    protected int SLSM=5;
    protected int ThoiHanMuon=15;
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
