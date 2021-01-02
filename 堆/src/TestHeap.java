import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2021-01-02
 * Time: 16:28
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;
    public TestHeap(){
        this.elem = new int[10];
    }
    public void adjustDown(int Parent,int len){
      int child = 2*Parent+1;
      //首先你得判断是不是有左孩子
      while (child<len){
          //是否有右孩子，如果有，child保存左右孩子最大值的下标
          if(child+1<len&&elem[child]<elem[child+1]){
              child++;
          }
          //child当中存储的就是最大值的下标
          if(elem[child]>elem[Parent]){
              int temp = elem[child];
              elem[child]=elem[Parent];
              elem[Parent]=temp;
              Parent=child;
             child = 2*Parent+1;
          }else{
              break;
          }
      }
    }
    public void initHeap(int[] array){
        for(int i = 0 ;i<array.length;i++){
            this.elem[i] = array[i];
            this.usedSize++;
        }
        for(int i =(usedSize-1-1)/2;i>=0;i--){
         adjustDown(i,usedSize);
        }
    }
    public void adjustUp(int child){
       int Parent =(child-1)/2 ;
       while(child>0){
          if(elem[child]>elem[Parent]){
              int temp = elem[child];
              elem[child]=elem[Parent];
              elem[Parent]=temp;
              child = Parent;
              Parent=(child-1)/2;
          }else{
              break;
          }
       }
    }
    public void push(int val){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*elem.length);
        }
        this.elem[usedSize] = val;
        this.usedSize++;
        adjustUp(usedSize-1);
    }
    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    public void pop(){
        //0、判空
        if(isEmpty()) return;
        //1、交换堆顶和最后一个元素
        int temp = elem[0];
        elem[0] = elem[usedSize-1];
        this.elem[usedSize-1]=temp;
        usedSize--;
        //2、
        adjustDown(0,usedSize);
    }
    public boolean isEmpty(){
        return usedSize==0;
    }

}
