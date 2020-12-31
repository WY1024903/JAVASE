import javafx.animation.Animation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-02
 * Time: 2:20
 */
class Aminal{
    public String name;
    public Aminal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(this.name+"eat()");
    }
}
class Cat extends Aminal {
    public Cat(String name){
        super(name);
        this.name = name;
    }
   /* public String name;
    public void eat(){z
        System.out.println("Cat:eat()");
    } */
}
class Dog{
   /* public String name;
    public void eat(){
        System.out.println("Dog:eat()");
    }*/
    public void wangwang(){
        System.out.println("wangwang");
    }
}
public class TestDemo{
    public static void main(String[] args) {
       Cat  cat = new Cat();
       cat.name = "mimi";
       cat.eat();
    }
}