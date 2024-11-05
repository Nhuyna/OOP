public class NhanVien extends People {
    protected int SoGioLam;
    protected int Luong;

    public void setSoCaLam(int SoGioLam) {
        this.SoGioLam = SoGioLam;
    }
    public void setLuong(int Luong) {
        Luong = Luong;
    }
    public int TinhLuong(){
        return SoGioLam*Luong;
    }

}
