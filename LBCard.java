public abstract  class LBCard {
    protected String idC;
    protected NguoiMuon nguoiMuon;
    public abstract String TypeCard();
    public abstract int PhiMuon(int sl);

    public void setIdC(String idC) {
        this.idC = idC;
    }
    

    public String getIdC() {
        return idC;
    }

    public void setNguoiMuon(NguoiMuon nguoiMuon) {
        this.nguoiMuon = nguoiMuon;
    }

    public NguoiMuon getNguoiMuon() {
        return nguoiMuon;
    }
    public String toString(){
        return String.format("%6s%20s", idC,nguoiMuon.getName());
    }

}
