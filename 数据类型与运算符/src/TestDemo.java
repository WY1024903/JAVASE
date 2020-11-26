/**
 * Created with IntelliJ IDEA.
 * Description:数据结构与运算符
 * User: Administrator
 * Date: 2020-11-26
 * Time: 8:04
 */
public class TestDemo {
    public static void main(String[] args) {
     int a = 10;
     a = a++;
     System.out.println(a);//注意 结果是10
    }
    public static void main9(String[] args) {
        //String转化为int
        String str1 = "123";
        int a = Integer.valueOf(str1);
    }
    public static void main8(String[] args) {
        //int转换为字符
        int num = 10;
        String str = 10+"";
        System.out.println(str);//方法一 拼接
        String str2 = String.valueOf(num);
        System.out.println(str2);//方法二
    }
    public static void main7(String[] args) {
        //byte:
        //byte a =128; 初始化变量时 不能超过其数值范围
       // byte b = Byte.MAX_VALUE+1; int不能直接付给byte
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = (byte)(b1+b2);//当两个byte相加时，会提升为int类型


    }
    public static void main6(String[] args) {
        //强制类型转换
        int a = 10;
        long b = a;
        int c = (int)b;
        System.out.println(c);
    }
    public static void main5(String[] args) {
        //常量：在程序运行过程中不可改变的量
       // 不管是变量还是常量，都要进行初始化，且常量只能初始化一次
        //常量要大写
        final int A = 10;
        System.out.println(A);
    }
    public static void main4(String[] args) {
        //代码块问题
        int a = 10;
        {
            a=99;
            System.out.println(a);
        }
        System.out.println(a);
    }
    public static void main3(String[] args) {
        //字符串的拼接
        System.out.println("ab"+"cd");
        int a = 10;
        int b = 20;
        System.out.println("a="+10);
        System.out.println("a="+a+"b="+b);
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1+str2);

    }
    public static void main2(String[] args) {
        //转义字符
        System.out.println("\"abcd\"");
    }
    public static void main1(String[] args) {
        //String
        String str = "hello";
        System.out.println(str);
        System.out.println("打印并且换行");
        System.out.print("打印但是不换行");
        System.out.printf("%s\n","格式化打印");

    }
}
