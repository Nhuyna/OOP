public class Location {
    protected String id;
    protected String Khuvuc;
    protected String Ke;
    protected String Hang;
    public Location(){
    }
    public Location(String id,String khuvuc,String Hang,String Ke){
        this.id=id;
        this.Khuvuc=khuvuc;
        this.Ke=Ke;
        this.Hang=Hang;
    }
 
    public void setKhuvuc(String khuvuc) {
        Khuvuc = khuvuc;
    }
    public String getKhuvuc() {
        return Khuvuc;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public void setKe(String Ke) {
        this.Ke = Ke;
    }

    public String getHang() {
        return Hang;
    }

    public String getKe() {
        return Ke;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString(){
      return String.format("%10s%10s%10s%10s",getId(),getKhuvuc(),getHang(),getKe());
    }
    public static Location[] addElementLocation(Location ViTri[], Location tmp) {
        Location[] array = new Location[ViTri.length+1];
        System.arraycopy(ViTri, 0, array, 0, ViTri.length);
        array[ViTri.length] = tmp;
        return array;}

    public static Location SearchId(Location ViTri[],String a){
        // System.out.println("hi");
        for(Location x : ViTri){
            // System.out.println("getId: "+x.getId());
          if(x.getId().equals(a)){
                   
                  return x;
                 }
            }
              return null;
        }
}
