//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package week01.day01;
import java.util.Arrays;
public class Practice{

    public static void main (String[] args){
        String name = "Nikita";
        int age = 27;
        double salary = 99000;
        int[] numbers = {1,-1,3};
        String result = Arrays.toString(RunningSum(numbers));
        System.out.println(result);
    }
    public static int add(int x,int y){
        return x + y;
    }
    public static int subtract(int x,int y){
        return x - y;
    }
    public static int[] arrayf(int[] x){
//        concatination of arrays in JAVA
        int[] r = new int[2*(x.length)];

        for(var i = 0; i < x.length; i++){
            r[i]= x[i];
            r[x.length+i]= x[i];
        }
        return r;
    }

    public static int[] RunningSum(int[] nums){
        int nl = nums.length;
        int temp=0;
        for(int i=0 ; i<nl; i++){
            temp = temp + nums[i];
            nums[i]= temp;

        }
        return nums;
    }

}
