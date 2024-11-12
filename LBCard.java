import java.io.BufferedReader;
import java.io.FileReader;

public abstract  class LBCard {
    protected String idC;
    protected NguoiMuon nguoiMuon;
    public abstract String TypeCard();
    public abstract int PhiMuon(int sl);
    public LBCard(){

    }
    public LBCard(String idC,NguoiMuon nguoiMuon){
     this.idC=idC;
     this.nguoiMuon=nguoiMuon;
    }
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
    @Override
    public String toString(){
        return String.format("%6s%20s%5s", idC,nguoiMuon.getName(),TypeCard());
    }
    public static LBCard[] DocGhiDL(boolean a,LBCard[] DS){
             if(a){
             
            // try {
            //  FileWriter fw =new
            //   FileWriter("./data/BookItem.txt");
            //  BufferedWriter bw =new BufferedWriter(fw);
            //            bw.write(""+CTSach.length);
            //            bw.newLine();
            //            for(BookItem t:CTSach){
            //              // bw.write(t.toString());
                        
            //             bw.write(t.id+";"+t.name+";"+t.Author.idA+";"+t.category.idC);
            //             bw.newLine();
            //            }
            //            bw.close();
            //            fw.close();
            //      } catch (Exception e) {
            //      }
                  
                 }
                 else{
                        try {
                          int sl;
                         FileReader fr=new FileReader("./data/LBCard.txt");
                         BufferedReader br =new BufferedReader(fr);
                         String line="";
                         sl = Integer.parseInt(br.readLine());                      
                          
                                int i=0;
                                NguoiMuon DSNM[]=new NguoiMuon[0];
                                DSNM=NguoiMuon.NhapGhiDL(false, DSNM);  
                                while(true){
                                
                                line=br.readLine();
                                if(line ==""){
                                 break;
                                }
                             String txt[]=line.split(";");
                             String id=txt[0];
                             String idN=txt[1];
                             String type=txt[2];
                              
                             NguoiMuon tmp=NguoiMuon.SearchId(DSNM, idN);
                             LBCard tmpL;
                             if(type.equals("A")){
                               tmpL =new TypeA(id, tmp);
                             }
                             else{
                                tmpL=new TypeB(id,tmp);
                             }
                             DS=LBCard.addElementLBCard(DS, tmpL);
                             
                                //  System.out.println(Authors.SearchIdA(tmpA, author).getName());
                                  // System.out.println(c.idBIteam+"   "+c.getBook().name+"   "+c.situation+"  "+c.getLocation().toString());
                              //  System.out.println(c.idBIteam+"  "+c.getBook().name+"  "+c.situation + "  "+ c.location.toString());
                              //  System.out.println(c.toString());
                                             }
                                             br.close();
                                             fr.close();
                                     } catch (Exception e) {
                                        System.out.println("xong r"); 
                                     }
                                     }
                                    
        
                                 return DS;

    }

    public static LBCard[] addElementLBCard(LBCard[] DS, LBCard tmp) {
        LBCard[] array = new LBCard[DS.length+1];
        System.arraycopy(DS, 0, array, 0, DS.length);
        array[DS.length] = tmp;
        return array;}
}
