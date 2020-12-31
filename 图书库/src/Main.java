import Book.BookList;
import operation.IOperation;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:06
 */
public class Main {
    public static User login(){
        System.out.println("请输入你的姓名");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("请输入你的身份，1是管理员，0是普通用户");
        int choice = scan.nextInt();
        if(choice==1){
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user =login();
        while(true){
            int choice = user.menue();
            IOperation iOperation = user.doOperation(choice);
            iOperation.work(bookList);

        }
    }
}
