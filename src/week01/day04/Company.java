package week01.day04;

//import java.util.concurrent.ConcurrentMap;

public class Company {
    static String company = "Deloitte";
    String department ;
    String talentGroup ;

    public  Company(String department, String talentGroup){
        this.department= department;
        this.talentGroup = talentGroup;
    }

    public static String getCompany() {
        return company;
    }
    public void display(){
        System.out.println("Company: "+company);
        System.out.println("Department: "+ department);
        System.out.println("TalentGroup: "+talentGroup);

    }
}
