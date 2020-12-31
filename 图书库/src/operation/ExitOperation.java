package operation;

import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:09
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("退出系统！");
        System.exit(0);
    }
}
