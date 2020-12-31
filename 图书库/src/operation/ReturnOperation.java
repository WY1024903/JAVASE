package operation;

import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:10
 */
public class ReturnOperation implements  IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("归还图书！");
    }
}
