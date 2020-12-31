package Book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:06
 */
public class BookList {
    private Book[] elem = new Book[10];
    private int usedSize;

    public BookList() {
        this.elem[0] = new Book("三国演义", "罗贯中", 15, "小说");
        this.elem[0] = new Book("java", "比特", 54, "学习");
        this.elem[0] = new Book("西游记", "吴承恩", 18, "小说");
        this.usedSize = 3;
    }

   public void setBook(int pos, Book book){
        this.elem[pos]=book;
   }
   public Book getBook(int pos){
        return this.elem[pos];
   }
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
