import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-28
 * Time: 23:28
 */
public class TestDemo {
    public static void tranform(int[] array){
       int left = 0;
       int right = array.length-1;
       while(left<right){
           if(array[left]%2!=0&&array[right]%2==0){
               int temp = array[left];
               array[left] = array[right];
               array[right] = temp;
               left++;
               right--;
           }else if(array[left]%2==0){
               left++;
           }else if(array[right]%2!=0){
               right--;
           }

       }
       System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        //给定一个整形数组，将所有的偶数放在前半部分，将所有的奇数放在后半部分
        int[] array = {2,4,6,3,7,9,5};
        tranform(array);
    }
    public static void fuc(int[] array){
        int left =0;
        int right = array.length-1;
        while(left<right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
  System.out.println(Arrays.toString(array));
    }
    public static void main12(String[] args) {
        //数组逆序
        int[] array ={1,2,3,4,5,6,7,8,9,10};
        fuc(array);
    }
    public static void bubbleSort(int[] array){

        for(int i = 0;i<array.length-1;i++){
            boolean flag=false;
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[i]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
    public static void main11(String[] args) {
       int[] array ={1,12,34,52,61,37,82};
       bubbleSort(array);
    }
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;

        while(left<=right){
            int middle = (left+right)/2;
            if(key>array[middle]){
                left=middle+1;
            }else if(key<array[middle]){
                right=middle-1;
            }else{
             return middle;
            }
        }
        return -1;
    }
    public static void main10(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int key =9;
       int ret = binarySearch(array,key);
       System.out.println(ret);
    }
    public static double fun(int[] array){
        int sum=0;
      for(int x :array){
          sum+=x;
      }
      double ret =sum/array.length*1.0;
      return ret;
    }
    public static void main9(String[] args) {
        //求数组中元素的平均值
        int[] array={1,2,3};
        double ret = fun(array);
        System.out.println(ret);
    }
    public static void max(int[] array){
       int max=0;
       if(array==null||array.length==0) {
           System.out.println("-1");
        }
       for(int x :array){
           if(x>max){
               max=x;
           }
       }
       System.out.println(max);
    }
    public static void main8(String[] args) {
        //找出数组中最大的元素
        int[] array={1,2,3,4};
        max(array);
    }
    public static void main7(String[] args) {
     //数组的拷贝（4种方法）
        System.out.println("======for======");
        int[] array = {1,2,3,4,5};
        int[] copy = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            copy[i] = array[i];
        }
        System.out.println(Arrays.toString(copy));
        System.out.println("======Arrays========");
        int[] copy1 = Arrays.copyOf(array,array.length);
        System.out.println(copy1);
        System.out.println("======system=======");
        int[] copy3 =new int[array.length];
        System.arraycopy(array,0,copy3,0,array.length);
        System.out.println(Arrays.toString(copy3));
        System.out.println("=======clone=======");
        int[] copy4 = array.clone();
        System.out.println(Arrays.toString(copy4));
    }
    public static void toString(int[] array){
        String ret ="[";
        for (int i = 0; i <array.length ; i++) {
            ret+=array[i];
            if(i!=array.length-1){
                ret+=",";
            }
        }
        ret+="]";
        System.out.println(ret);

    }
    public static void main6(String[] args) {
        int[] array ={1,2,3,4,5};
        toString(array);
    }
    public static void main5(String[] args) {
        //数组转字符串
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

    }
    public static int[] func2(int[] array){
        int[] temp = new int[array.length];
        for(int i = 0;i<array.length;i++){
            temp[i]=array[i];
        }
        for(int i = 0;i<array.length;i++){
            temp[i]=temp[i]*2;
        }
        return temp;
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4};
        int[] temp=func2(array);
        System.out.println(Arrays.toString(temp));
    }
    public static void printArray(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array);
    }
    public static void main2(String[] args) {
        int[]  array = {};
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }//数组长度为0；打印出来是空
        System.out.println(array[0]);//下标越界
        int[]  array1 = new int[5];
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }//打印出来是5个0
    }
    public static void main1(String[] args) {
        int[]  array1 = {1,2,3,4,5};
        int[]  array2 = new int[]{1,2,3,4,5};
        int[]  array3 = new int[5];
        //方式一for循环
        for(int i = 0; i<array1.length;i++){
            int ret = array1[i];
            System.out.println(ret);
        }
        //方式二 foreach
        for(int x :array1){
            System.out.println(x+" ");
        }

        //方式三  使用工具类Arrays
        String str = Arrays.toString(array1);
        System.out.println(str);
    }
}
