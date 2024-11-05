class QLSach implements  QLTV{

    // @Override
    // public void LuuDuLieu() {
    //     // TODO Auto-generated method stub
    //     System.out.println("hi");
    // }

    // @Override
    // public void NhapDuLieu() {
    //     // TODO Auto-generated method stub
    //     System.out.println("ha");
    // }

    // @Override
    // public void NhapThongTin() {
    //     // TODO Auto-generated method stub
    //     System.out.println("test");
        
    // }
    @Override
    public void InThongTin(){
        //Test
        System.out.println("In thông tin sách nè");
         Authors tg1=new Authors("123","Nguyễn Nhật Ánh");
        Authors tg2=new Authors("456","Nam Cao");
        Category tl1=new Category("111","Truyện ngắn");
        Books sach=new Books("999","Tôi là Bêto",tg1,tl1);
        String tmp=String.format("%5s%20s%20s%20s","Stt","Tên Sách","Tên tác giả","Thể loại");
        System.out.println(tmp);
     String tmp1=String.format("%5d",1,sach.getName(),sach.toString());
       String tmp3=sach.toString(sach);
       System.out.println(String.format("%5d", 1)+tmp3);
    }

    
}
