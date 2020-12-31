package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:11
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }
    public int menue() {
        System.out.println("hello"+this.name+"欢迎你");
        System.out.println("1、查找图书！");
        System.out.println("2、借阅图书！");
        System.out.println("3、归还图书！");
        System.out.println("0、退出图书！");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;

    }
}
