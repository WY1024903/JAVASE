package operation;

import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:10
 */
public interface IOperation {
    Scanner scan  = new Scanner(System.in);
    void work(BookList booklist);
}
