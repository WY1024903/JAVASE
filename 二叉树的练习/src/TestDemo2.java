import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-31
 * Time: 19:35
 */
class Node {
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
    }
}
class MyQueue{
   public Node head;
   public Node tail;
   public void offer(int val){
      Node node = new Node(val);
      if(isEmpty()){
          head=node;
          tail=node;
          return;
      }else{
          tail.next=node;
          tail=node;
      }
   }
   public int poll(){
       if(isEmpty()){
           return -1;
       }
       int ret = head.val;
       if(head.next==null){

           head=null;
           tail=null;
       }else{
       head=head.next;}
       return ret;
   }
   public int peek(){
       if(isEmpty()){
           return -1;
       }
       int ret = head.val;
       return ret;
   }
   public boolean isEmpty(){
       if(head==null){
           return true;
       }
       return false;
   }
}
public class TestDemo2 {
    public static void main(String[] args) {
     MyQueue myQueue = new MyQueue();
     myQueue.offer(1);
     myQueue.offer(2);
     myQueue.offer(3);
     myQueue.offer(4);
     System.out.println(myQueue.peek());
     System.out.println(myQueue.poll());
     System.out.println(myQueue.poll());
     System.out.println(myQueue.poll());
     System.out.println(myQueue.poll());
    }
}
