import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-31
 * Time: 18:01
 */
class MyStack{
    public int[] elem;
    public int usedSize;
    public MyStack(){
        this.elem = new int[5];
    }
    public void push(int item){

        if(usedSize==elem.length){
            return;
        }
        elem[usedSize++]=item;
    }
    public int pop(){
       if(isEmpty()){
           return -1;
       }

       int ret =  elem[usedSize-1];
       usedSize--;
       return ret;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int ret =  elem[usedSize-1];
        return ret;
    }
    public boolean isEmpty(){
       if(usedSize==0){
           return true;
       }
       return false;
    }

}
public class TestDemo1 {
    public static void main(String[] args) {
     MyStack myStack = new MyStack();
     myStack.push(1);
     myStack.push(12);
     myStack.push(3);
     System.out.println(myStack.pop());
     System.out.println(myStack.peek());

    }
}
