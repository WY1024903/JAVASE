package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:10
 */
public class Admin extends User{
    @Override
    public int menue() {
        System.out.println("hello"+this.name+"欢迎你");
       System.out.println("1、查找图书！");
       System.out.println("2、新增图书！");
       System.out.println("3、删除图书！");
       System.out.println("4、显示图书！");
       System.out.println("0、退出图书！");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;

    }

    public Admin(String name){
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };


    }
}
