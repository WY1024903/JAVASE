/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-30
 * Time: 7:32
 */
class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
    }
}
class singlelist{
    public Node head;
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            this.head=node;
        }else{
            node.next = this.head;
            this.head= node;
        }
    }
    public void display(){
        Node cur = this.head;
        while(cur!=null){
            System.out.print(cur.data);
            cur=cur.next;
        }
        System.out.println();
    }
    public void addLast(int data){
        Node cur = this.head;
        Node node = new Node(data);
        if(head==null) {
            this.head = node;
            return;
        }else{
            while(cur.next!=null){
               cur=cur.next;
            }
            cur.next=node;
        }
    }
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
   public Node searchPrev(int index){
       Node cur = this.head;
       int count = 0;
       while(count<index-1){
           cur=cur.next;
           count++;
       }
       return cur;
   }
   public void addIndex(int index,int data){
        Node cur = searchPrev(index);
       Node node = new Node(data);
     if(index<0||index>size()) {
         System.out.println("index位置不合法");
         return;
     }
     if(index==0){
         addFirst(data);
         return;
     }
     node.next=cur.next;
     cur.next=node;
   }
   public boolean contains(int key){
       Node cur = this.head;
       while(cur!=null){
           if(cur.data==key){
               return true;
           }
       }
       return false;
   }
   public Node searchPrevNode(int key){
       Node cur = this.head;
       while(cur.next!=null){
           if(cur.next.data==key){
               return cur;
           }
           cur=cur.next;
       }
      return null;
   }
   public void remove(int key){
        Node cur = searchPrevNode(key);
      if(cur==null){
          System.out.println("key不存在");
          return;
      }
      Node del = cur.next;
      cur.next=del.next;
   }
   public void removeAllkey(int key){
        Node prev = this.head;
        Node cur = prev.next;
        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.data==key){
            head=head.next;
        }
   }
   public void clear(){
        this.head = null;
   }
   public Node reverselist(){
        Node cur = this.head;
        Node newHead = null;
        Node prev = null;
        while(cur!=null){
            Node curNext = cur.next;
            if(curNext==null){
                newHead = cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
   }

}