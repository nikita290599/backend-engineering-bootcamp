package week01.day04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Employee emp = new Employee(1234,"Nikita",140000);
        Calculator cal = new Calculator();

//        System.out.println(cal.add(5, 10));          // Calls add(int, int)
//
//        System.out.println(cal.add(5.5, 10.5));      // Calls add(double, double)
//
//        System.out.println(cal.add(5, 10, 15));
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int prev=0;
        int next=1;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j =next;j<nums.length;j++){
                System.out.println("ITERATION i:"+i);
                System.out.println("j:"+j);
                System.out.println(Arrays.toString(nums));
                if(nums[j]>nums[i]){
                    temp=nums[i+1];
                    nums[i+1]=nums[j];
                    nums[j]=temp;

                    prev=i+1;
                    System.out.println("next:"+next);
                    System.out.println("prev:"+prev);
                    break;
                }
                next= j;

            }
            if(next==nums.length-1 ){

                System.out.println("prev: "+prev);
                break;
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(temp+" :prev: "+(prev+1));


    }
}


