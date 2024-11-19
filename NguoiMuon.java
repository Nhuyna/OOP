import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Calendar;

public class NguoiMuon extends People {
    public NguoiMuon() {

    }

    public NguoiMuon(String id, String name, Calendar birthDate, String address) {
        super(id, name, birthDate, address);
    }

    public static NguoiMuon[] NhapGhiDL(boolean a, NguoiMuon DS[]) {
        int sl;

        if (a) {
            System.out.println("SoLuongTacGiala: " + TacGia.length);
            try {
                FileWriter fw = new FileWriter("./data/NhanVien.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                for (NhanVien t : TacGia) {
                    bw.write(t.toString());
                    bw.write(t.getIdA() + ";" + t.getName());
                    bw.newLine();
                }
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        } else {
            try {

                FileReader fr = new FileReader("./data/NguoiMuon.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = "";
                sl = Integer.parseInt(br.readLine());

                while (true) {

                    line = br.readLine();
                    if (line == "") {
                        break;
                    }
                    String txt[] = line.split(";");
                    String id = txt[0];
                    String name = txt[1];
                    String linetmp = txt[2];
                    String t[] = linetmp.split("/");
                    Calendar NgaySinh = Calendar.getInstance();
                    NgaySinh.set(Calendar.DAY_OF_MONTH, Integer.parseInt(t[0]));
                    NgaySinh.set(Calendar.MONTH, Integer.parseInt(t[1]));
                    NgaySinh.set(Calendar.YEAR, Integer.parseInt(t[2]));
                    String address = txt[3];

                    NguoiMuon tmp = new NguoiMuon(id, name, NgaySinh, address);

                    DS = NguoiMuon.addElementNguoiMuon(DS, tmp);
                }
                br.close();
                fr.close();
            } catch (Exception e) {

            }
        }
        return DS;
    }

    public static NguoiMuon[] addElementNguoiMuon(NguoiMuon DS[], NguoiMuon tmp) {
        NguoiMuon[] array = new NguoiMuon[DS.length + 1];
        System.arraycopy(DS, 0, array, 0, DS.length);
        array[DS.length] = tmp;
        return array;
    }

    public static NguoiMuon SearchId(NguoiMuon DS[], String a) {
        for (NguoiMuon x : DS) {
            if (x.getId().equals(a)) {
                return x;
            }
        }
        return null;
    }

    // kiem tra format khi nhap
    public static boolean validateFormat(String id, String name, Calendar birthDate, String address) {
        // Example validation: check if ID is not empty and name is not empty
        if (id.isEmpty() || name.isEmpty() || address.isEmpty()) {
            return false;
        }
        // Add more validation as necessary (e.g., date format)
        return true;
    }

    // Chỉnh Sửa
    public static NguoiMuon[] updateNguoiMuon(NguoiMuon DS[], NguoiMuon updated) {
        for (int i = 0; i < DS.length; i++) {
            if (DS[i].getId().equals(updated.getId())) {
                // Check for duplicates
                if (SearchId(DS, updated.getId()) != null && !DS[i].getId().equals(updated.getId())) {
                    System.out.println("Updated ID conflicts with existing record.");
                    return DS; // Conflict found, do not update
                }
                DS[i] = updated; // Update the record
                return DS; // Return updated array
            }
        }
        System.out.println("ID not found for update.");
        return DS; // ID not found, return original array
    }

    // Xoá

    public static NguoiMuon[] deleteNguoiMuon(NguoiMuon DS[], String id) {
        NguoiMuon toDelete = SearchId(DS, id);
        if (toDelete == null) {
            System.out.println("ID not found. Cannot delete.");
            return DS; // ID not found, return original array
        }
        NguoiMuon[] newArray = new NguoiMuon[DS.length - 1];
        int index = 0;
        for (NguoiMuon x : DS) {
            if (!x.getId().equals(id)) {
                newArray[index++] = x; // Add to new array if not the one to delete
            }
        }
        return newArray; // Return new array without the deleted element
    }

    // Xuất

    public static void exportInformation(NguoiMuon DS[]) {
        System.out.println("Thông tin người mượn:");
        for (NguoiMuon borrower : DS) {
            LBCard borrowerCard = null;
            for (LBCard card : LBCards) {
                if (card.getId().equals(borrower.getId())) {
                    borrowerCard = card;
                    break;
                }
            }
            System.out.println("ID: " + borrower.getId() + ", Ho va ten: " + borrower.getName() +
                    ", Ngay sinh: " + borrower.getBirthdayDate().get(Calendar.DAY_OF_MONTH) + "/" +
                    borrower.getBirthdayDate().get(Calendar.MONTH) + "/" +
                    borrower.getBirthdayDate().get(Calendar.YEAR) +
                    ", Loai the: " + (borrowerCard != null ? borrowerCard.getType() : "N/A"));
        }
    }
}
