import jdk.jfr.StackTrace;
import org.junit.Test;

public class ExceptionText {
    @Test
    public void test1(){
        int[] arr=new int[10];
        System.out.println(arr[10]);
    }
    public static void main(String[] args) {
        int[] arr=null;
        System.out.println(arr[3]);
    }
}
