/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-29
 * Time: 19:55
 */
public class Arraylist {
    public int[] elem;
    public int usedSize;

    public Arraylist() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    public Arraylist(int capacity) {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    public void add(int pos, int data) {
        if (pos > usedSize || pos < 0) {
            return;
        }
        if (usedSize == elem.length) {
            return;
        }

        for (int i = usedSize; i > pos; i--) {
            elem[i] = elem[i - 1];
        }
        usedSize++;
        elem[pos] = data;
    }

    public void display() {
        for (int i = 0; i < elem.length; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println(" ");
    }

    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (toFind == elem[i]) {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (toFind == elem[i]) {
                return i;
            }
        }
        return -1;
    }

    public int getPos(int pos) {
        if (pos >= usedSize || pos < 0) {
            return -1;
        }
        return elem[pos];
    }

    public int size() {
        return usedSize;
    }

    public void setPos(int pos, int value) {
        if (pos > usedSize || pos < 0) {
            return;
        }
        elem[pos] = value;
    }

    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1) {
            return;
        }
        for (int i = index; i < usedSize - 1; i++) {
            elem[i] = elem[i + 1];
        }
        usedSize--;
    }
}
