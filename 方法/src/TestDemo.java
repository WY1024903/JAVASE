/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-26
 * Time: 17:20
 */
public class TestDemo {
    public static boolean isAdmir(String userld){
        return userld.toLowerCase()=="admin";
    }
    public static void main(String[] args) {
        System.out.println(isAdmir("Admin"));
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main3(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a="+a+","+"b="+b);
        swap(a,b);
        System.out.println("a="+a+","+"b="+b);
    }
    public static void twoMaxNumber(int a,int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
   public static int fuc(int num){
        int fac=1;
        for( int i=1;i<=num;i++){
            fac=fac*i;
        }
        return fac;
   }
   public static int fuc1(){
        int sum=0;
        for(int i=1;i<=5;i++){
            int num=i;
            sum+=fuc(num);
        }
        return sum;
   }


    public static void main2(String[] args) {
        int num=fuc1();
        System.out.println(num);
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        twoMaxNumber( a, b);//方法的调用
    }
}
