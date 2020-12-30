import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 15:07
 */
class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
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
        }
        tail.next=node;
        tail=node;
    }
    public int poll(){
      if(isEmpty()){
          return -1;
      }
      if(head==tail){
          head=head.next;
          tail=null;
      }else {
          head = head.next;
          return head.val;
      }
        return head.val;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        if(head==tail){
            head=head.next;
            tail=null;
        }

        return head.val;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
}
public class TestDemo {
    public static void main1(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(3);
        queue.offer(6);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.isEmpty());

    }
}
