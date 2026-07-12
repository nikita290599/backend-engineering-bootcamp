package week01.day02;
import week01.day02.Employee;
import week01.day02.Customer;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Employee emp = new Employee("Nikita",101,"Cloud",1400000);
        Employee priya = new Employee("Priya",102,"Consulting",1000000);
        String[] OrderH= {"Apple", "Mango", "Grapes"};
        Customer Nikita = new Customer("Nikita", 27, OrderH);
//        emp.display();
//        priya.display();
//        Nikita.displayCustomer();
        int[][] accounts = {{1,2,3},{2,3,4},{2,1,1},{2,3,4},{2,1,1}};
        int richest=0;
        int accountsum=0;
        for(int customer=0; customer< accounts.length; customer++ ){
            for(int account=0; account< accounts[customer].length; account++ ){
                accountsum+= accounts[customer][account];
            }
            if(customer==0){
                richest=accountsum;
            }
            else{
                if(accountsum>=richest){
                    richest= accountsum;
                }
                else{
                    richest = richest;
                }
            }
            accountsum=0;

        }
//My solution
        int[] nums= {1,2,3,4,4,3,2,1};
        int counter=0;
        int [] shuffledNums= new int[nums.length] ;
        for(int num = 0 ; num <nums.length/2 ; num++){
            shuffledNums[counter]=nums[num];
            shuffledNums[counter+1]=nums[(nums.length/2)+num];
            counter+=2;
        }

        System.out.println(Arrays.toString(shuffledNums));


        for(int num = 0 ; num <nums.length/2 ; num++){
            shuffledNums[counter]=nums[num];
            shuffledNums[counter+1]=nums[(nums.length/2)+num];
            counter+=2;
        }
}
}