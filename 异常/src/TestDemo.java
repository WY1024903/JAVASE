/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-02
 * Time: 13:12
 */
public class TestDemo {
   /* public static void func(){
        func();
    }*/

    public static void main(String[] args) {
        /*func();*/
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("hello");
        }
        System.out.println("bit");
    }
}
