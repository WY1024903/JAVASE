import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2021-01-02
 * Time: 16:01
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] array={27,15,19,18,28,34,65,49,25,37};
        TestHeap testHeap = new TestHeap();
        testHeap.initHeap(array);
    }
    public static void main1(String[] args) {
        PriorityQueue<Integer>  priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(13);
        priorityQueue.offer(3);
        priorityQueue.offer(8);
        priorityQueue.offer(49);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.print(priorityQueue.peek());
    }
}
