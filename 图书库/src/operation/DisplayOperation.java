package operation;

import Book.Book;
import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:09
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("显示图书");
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            System.out.println(book);

        }
    }
}
