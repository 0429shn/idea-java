import java.util.*;
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util= new ArrayUtil();
        int[] arr=new int[]{32,34,32,5,3,34,654,-98,0,-53,5};
        int max= util.getMax(arr);
        System.out.println("数组为：");
        util.print(util.copy(arr));
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+util.getMin(arr));
        System.out.println("和为："+util.getSum(arr));
        System.out.println("平均值为："+util.getAvg(arr));
        System.out.println("反转后的数组为：");
        util.reverse(arr);
        util.print(arr);
        System.out.println("排序后为：");
        util.sort(arr);
        util.print(arr);
        System.out.println("34的位置：");
        System.out.println(util.getIndex(arr,34));
    }
}
