import week01.day02.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {4,0,2,1,3};
//        encoding
//        new*nums.length+old
        int[] arr = new int[nums.length];
        for(int i=0 ; i< nums.length; i++){
              nums[i] = nums[i] + nums.length *(nums[nums[i]]%nums.length);
              System.out.println("big *");


            System.out.println("Iteration : "+ i+ " "+Arrays.toString(nums));
        }


//        decoding
        for(int i=0 ; i< nums.length; i++){

                nums[i] = nums[i]/nums.length;

        }
        System.out.println(Arrays.toString(nums));
    }
}