/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-08
 * Time: 8:46
 */

/**
 * 意义 ：代码简单，代码的重复使用
 * 子类在构造的同时，需要先帮助父类进行构造
 * this和super
 * this：代表当前对象的引用
 * this.data
 * this.func（）；
 * this（）
 * super：代表父类对象的引用
 * super.data
 * super.fun()
 * super();
 * 面试问题：子类继承了父类的什么东西？
 * 除构造方法外的所有东西
 * 私有的东西继承了但是不能访问
 * java是单继承的
 * 任何一个类都有一个父类：object
 * final：类被final修饰，表示类不能被继承
 * final 修饰常量，只能被初始化一次
 * final修饰方法
 * 向上转型
 * 通过父类引用调用的方法，一定实在父类当中存在的
 * 动态绑定：当前的方法，需要重写
 * 什么叫重写：
 * 重载和重写
 * 重载：1、方法名称相同
 * 2、参数列表不同
 * 3、返回值不做要求
 * 重写：
 * 1、方法名称相同
 * 2、参数列表相同
 * 3、放回值类型相同
 * 4、访问修饰限定符，父类的不能是private
 * 5、子类的访问修饰权限一定要大于等于父类的访问权限
 * 6、方法是不能是static ，否则不能动态绑定
 * 向上转型：
 * 父类引用引用子类对象，
 * 有三种方式：
 * 1、直接赋值
 * 2、方法传参
 * 3、方法的返回值
 * 动态绑定：在运行时发生类改变
 * 父类引用引用子类对象，同时通过父类引用曲调用父类和子类的同名覆盖方法
 * 会执行子类的方法
 * 指令：javac -encoding utf-8 TestDemo.java
 * javap -c TestDemo
 *构造函数当中，是否可以发生动态绑定，可以
 * 多态：
 *
 */
class Animal{
    protected String name;
    public void eat(){
        System.out.println(this.name+"eat()");
    }
    public Animal(String name){
   this.name = name;
    }
    public void func(){
        System.out.println(this.name+"func()");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);//显示调用父类的构造方法
       this.name = name;

    }
    public String name;
    public void eat(){
        System.out.println(this.name+"eat()");
    }
    public void func(){
        System.out.println(this.name+"func()");
    }
}
class Dog extends  Animal{
    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public String name;
        public void eat(){
            System.out.println(this.name+"eat()");
        }
    public void wangwang(){
        System.out.println(this.name+"wangwang()");
    }
}

public class TestDemo {
    public static void main(String[] args) {

    }
    public static void main3(String[] args) {
        Animal animal2 = new Cat("mimi");//向上转型 父类引用引用子类对象
        animal2.eat();
        Cat cat = (Cat)animal2;
        if(animal2 instanceof  Dog){
            Dog dog = (Dog)animal2;
            dog.wangwang();//instanceof 可以判定一个引用是否是某个类的实例 ，如果是，则返回true
        }
    }
    public static void main2(String[] args) {
      /*  Animal animal = new Animal("dongwu");
        animal.eat();
        Cat cat = new Cat("mimi");
        cat.eat();*/
        Animal animal2 = new Cat("mimi");//向上转型 父类引用引用子类对象
        animal2.eat();
       // animal2.func();

    }
    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        cat.name="mimi";
        cat.eat();
    }
}
