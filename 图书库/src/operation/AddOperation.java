package operation;

import Book.Book;
import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:07
 */
public class AddOperation implements  IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("新增图书");
        System.out.println("请输入书名");
        String name = this.scan.next();
        System.out.println("请输入作者：");
        String author = this.scan.next();
        System.out.println("请输入价格：");
        int price = this.scan.nextInt();
        System.out.println("请输入类型");
        String type = this.scan.next();
        Book book = new Book(name,author,price,type);
        int currentSize = booklist.getUsedSize();
        booklist.setBook(currentSize,book);
        booklist.setUsedSize(currentSize+1);


    }
}
