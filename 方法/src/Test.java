/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-26
 * Time: 22:56
 */
public class Test {
    public static void move(char pos1,char pos2){
        System.out.println(pos1+"->"+pos2+" ");
    }
    public static void han(int n,char pos1,char pos2,char pos3){
        if(n==1) {
           move(pos1,pos3);
           return;
        }
        han(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        han(n-1,pos2,pos1,pos3);
    }
    public static void main(String[] args) {
        han(1,'A','B','C');


    }
    public static  int fib(int n){
        if(n==1||n==2){
            return n;
        }
     int ret = fib(n-1)+fib(n-2);
        return ret;
    }
    public static void main8(String[] args) {
        int ret = fib(5);
        System.out.println(ret);
    }
    public static int summ(int n){
        if(n<10){
            return n;
        }

             int ret = summ(n/10)+ n%10;
        return ret;

    }
    public static void main7(String[] args) {
        int ret = summ(1729);
        System.out.println(ret);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int ret= n+sum(n-1);
        return ret;
    }
    public static void main6(String[] args) {
       int ret = sum(10);
       System.out.println(ret);
    }
    public static void print(int n){
        if(n<10) {

            System.out.println(n%10);
            return ;
        }
        print(n/10);
        System.out.println(n%10);
    }
    public static void main5(String[] args) {
        print(1234);
    }
    public static void fuc(int n){
        if(n==1){
            return ;
        }
        int ret=0;
        fuc(n-1);


    }

    public static void main2(String[] args) {



    }
   public static int add(int a,int b){
         return  a+b;
    }
    public static double add(double c,double d){
        return  c+d;
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        add(a,b);
        double c = 1.0;
        double d = 2.0;
        add(c,d);

    }
}
