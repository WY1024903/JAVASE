package operation;

import Book.Book;
import Book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:09
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("查找图书！");
        String name = this.scan.next();
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i <currentSize ; i++) {
            Book book = booklist.getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
                break;
            }
        }
    }
}
