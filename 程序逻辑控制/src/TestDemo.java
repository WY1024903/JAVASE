import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-26
 * Time: 13:56
 */
public class TestDemo {

    public static void main(String[] args) {
        //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
        for(int i=0;i<=999;i++){
            int count=0;
            int temp=i;
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            temp=i;
            int sum = 0;
            while(temp!=0){

                sum+=Math.pow(temp%10,count);
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }

        }
    }
    public static void main14(String[] args) {
        //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int rand = random.nextInt(100)+1;
        while(true){
            int num = scan.nextInt();
            if(num<rand){
                System.out.println("小于");
            }else if(num>rand){
                System.out.println("大于");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
    public static void main13(String[] args) {
        //找到1-100之间既能被3又能被5整除的数
        for (int i = 1; i <100 ; i++) {
            if(i%15==0){
                System.out.println(i);
                continue;
            }
        }
    }
    public static void main12(String[] args) {
        //打印 1 - 100 之间所有的素数

        for (int i = 2; i <= 100; i++) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    System.out.println(i + "不是素数");
                    break;
                }
                j++;
            }
            if (j >= i) {
                System.out.println(i + "素数");
            }
        }
    }
    public static void main11(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        for (int i = 1000; i <= 2000; i++) {
            if(i%4==0&&i%100!=0||i%400==0){
                System.out.println(i);
            }
        }
    }
    public static void main10(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int count=0;
        for(int i = 1; i<=100;i++){
            if(i%10==9){
               count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main9(String[] args) {
        //1!+2!+3!+4!+5!
        int fac = 1;
        int i = 1;
        int sum = 0;
        while( i <=5){
            fac=fac*i;
            i++;
            sum+=fac;
        }
        System.out.println(sum);
    }
    public static void main8(String[] args) {
        //5的阶乘
        int fac = 1;
        int i = 1;
        while( i <=5){
            fac=fac*i;
            i++;
        }
        System.out.println(fac);
    }
    public static void main7(String[] args) {
        int a = 1;
        int sum = 0;
        int sumOdd=0;
        while(a<=100){
            sum += a;
            a++;
        }
        System.out.println(sum);
        int b=0;
        while(b<=100){
            sumOdd += b;
            b+=2;
        }
        System.out.println(sumOdd);
        int c = 1;
        int sumJI=0;
        while(c<=100){
            sumJI += c;
            c+=2;

        }
        System.out.println(sumJI);
    }
    public static void main6(String[] args) {
        int a = 1;
        switch(a){
            case 2:System.out.println("hello");break;
            case 3:System.out.println("EEE");break;
            case 1:System.out.println("333");break;
            default:System.out.println("yyyy");break;
        }
    }
    public static void main5(String[] args) {
        int x = 10;
        int y = 20;
        if(x == 20)
            if(y==10)
                System.out.println("AAA");
            else
                System.out.println("BBB");
    }
    public static void main4(String[] args) {
        //判断是不是闰年
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if(year % 4 ==0&&year%100!=0||year%400==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void main3(String[] args) {
       Scanner scan = new Scanner(System.in);
       while(scan.hasNextInt()){
           int num = scan.nextInt();
           if(num%2==0){
               System.out.println("hello");
           }else {
               System.out.println("else");
           }
        }
    }
    public static void main2(String[] args) {
        int num = 10;
        if(num%2==0){
            System.out.println("num="+"偶数");
        }else{
            System.out.println("num="+"奇数");
        }
    }
    public static void main1(String[] args) {
       /* if(1){
            System.out.println("hello");
        }*/

    }
}
