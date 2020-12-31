/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-08
 * Time: 10:34
 */
class Shape{
    public void draw(){

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
       System.out.println("○");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}
public class TestDemo1 {
    public static  void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        drawMap(cycle);
        Rect rect  = new Rect();
        drawMap(rect);
    }
}
