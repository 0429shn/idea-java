import java.util.*;
/*
 *
 * 自定义数组工具类
 */
public class ArrayUtil {
    //求数组最大值
    public int getMin(int[] arr){
        int minValue=arr[0];
        for(int i=1;i< arr.length;i++){
            if(minValue>arr[i])
                minValue=arr[i];
        }
        return minValue;
    }
    //取最小值
    public int getMax(int[] arr){
        int maxValue=arr[0];
        for(int i=1;i< arr.length;i++){
            if(maxValue<arr[i])
                maxValue=arr[i];
        }
        return maxValue;
    }
    //求和
    public int getSum(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //求平均值
    public int getAvg(int[] arr){
        return getSum(arr)/arr.length;
    }
    //反转数组
    public void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
    }
    //复制数组
    public int[] copy(int[] arr){
        int []arr1= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
    //排序
    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    //遍历数组打印
    public void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(",");
        }
        System.out.println("]");
    }
    //查找指定元素
    public int getIndex(int[] arr,int dest){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==dest){
                return i+1;
            }
        }
        return 0;
    }
}
