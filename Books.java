
public class Books {
    protected String id;
    protected String name;
    protected Authors Author;
    protected Category category;

    public Books() {

    }

    public Books(String id, String name, Authors Author, Category category) {
        this.id = id;
        this.name = name;
        this.Author = Author;
        this.category = category;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public Authors getAuthor() {
        return Author;
    }

    public void setAuthor(Authors Author) {
        this.Author = Author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%4s%45s%23s%23s", id, name, Author.name, category.NameC);
    }

    // Thêm
    public static Books[] addElementBooks(Books[] Sach, Books tmp) {
        Books[] array = new Books[Sach.length + 1];
        System.arraycopy(Sach, 0, array, 0, Sach.length);
        array[Sach.length] = tmp;
        return array;
    }

    // Sửa
    public static void updateBook(Books[] Sach, Books id, Books newBooks) {
        boolean found = false;
        for (int i = 0; i < Sach.length; i++) {
            if (Sach[i].getId().equals(id)) {
                Sach[i] = newBooks;
                found = true;
                System.out.println("Da cap nhat thong tin sach cho ID: " + id);
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sach voi ID: " + id);
        }
    }

    // Xóa
    public static Books[] removeBooks(Books[] Sach, String id) {
        int index = -1;
        for (int i = 0; i < Sach.length; i++) {
            if (Sach[i].getId().equals(id)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Khong tim thay sach voi ID: " + id);
            return Sach;
        }

        Books[] newArray = new Books[Sach.length - 1];
        System.arraycopy(Sach, 0, newArray, 0, index);
        System.arraycopy(Sach, index + 1, newArray, index, Sach.length - index - 1);
        System.out.println("Da xoa sach.\n");
        return newArray;
    }

    // Tìm kiếm bằng id
    public static Books SearchId(Books DS[], String a) {
        for (Books x : DS) {
            if (x.getId().equals(a)) {

                return x;
            }
        }
        return null;
    }

    // Tìm kiếm bằng tên
    public static Books findByName(Books[] Sach, String bookName) {
        for (Books x : Sach) {
            if (x.getName().equalsIgnoreCase(bookName)) {
                return x;
            }
        }
        return null;
    }
}
