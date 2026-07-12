package week01.day02;
import java.util.Arrays;
public class Customer {
        String name;
        int age;
        String[] orderHistory;
        public Customer(String name,
                        int age,
                        String[] orderHistory){
            this.name = name;
            this.age = age;
            this.orderHistory = orderHistory;
        }
        public void displayCustomer(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Order History: "+ Arrays.toString(orderHistory));
        }

}
