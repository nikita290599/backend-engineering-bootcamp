package week01.day03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        Employee emp = new Employee(
                "Nikita",
                101,
                "Cloud",
                1400000
        );
        System.out.println(4003%1000);

        emp.setId(0);
        System.out.println(emp.getSalary());

        int[] nums = {4,0,2,1,3};

        var oldnum= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[nums[i]]>=1000 || nums[nums[i]]<i ){
                if(nums[nums[i]]<i){
                    oldnum = 0;
                    nums[i] = nums[i]*1000+oldnum;
                }
//                System.out.println("oldNums"+nums[i]);
                else{
                    oldnum = nums[nums[i]] / 1000;
                    System.out.println("Iteration:" + i + " " + nums[nums[i]] + " " + oldnum);
                    nums[i] = nums[i] * 1000 + oldnum;

                    System.out.println("newNums" + nums[i]);
                }
            }
            else {
                System.out.println("oldNums"+nums[i]);
                nums[i] = nums[i] * 1000 + nums[nums[i]];
                System.out.println("newNums"+nums[i]);
            }
        }
        System.out.println(Arrays.toString(nums));
//decoding
        for(int i=0; i<nums.length; i++){
            if(nums[i]<1000){
                nums[i]= 0;
            }
            else{
                nums[i] = nums[i] % 1000 ;
            }


        }
        System.out.println(Arrays.toString(nums));
    }
}
