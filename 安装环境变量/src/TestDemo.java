/**
 * Created with IntelliJ IDEA.
 * Description:安装环境变量
 * User: Administrator
 * Date: 2020-11-25
 * Time: 20:11
 */

import java.sql.SQLOutput;

/**
 * String[] args 参数列表有什么意义
 * 打印出运行时给的参数
 */
public class TestDemo {
    public static void main(String[] args) {
        int a = 10;//4个字节
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        long b = 10L;//8个字节
        System.out.println(b);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        byte c = 15;//1个字节
        System.out.println(c);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        short d = 20;//2个字节
        System.out.println(d);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        float e = 1.0f;//4个字节
        System.out.println(e);
        double f = 2.0;//8个字节
        System.out.println(e);
        char ch = 'a';//2个字节  采用unicode编码
        System.out.println(ch);
        boolean flag = true;
        System.out.println(flag);


    }
    public static void main1(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);//数组长度为0
        }
    }
}
