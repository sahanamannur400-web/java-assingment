import java.util.Scanner;
public class employeedetails{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee name");
        String employeeName=sc.nextLine();
        System.out.println("Enter Employee id");
        int employeeid=sc.nextInt();
        System.out.println("Enter Employee age");
        int employeeage=sc.nextInt();
        System.out.println("Enter Employee salary");
        double employeesalary=sc.nextDouble();
        System.out.println("Enter Employee premanentemp");
        boolean employeepremanentemp=sc.nextBoolean();
        
        System.out.println("-----Employee Details-----");
        System.out.println("Employee name"+employeeName);
        System.out.println("Employee id"+employeeid);
        System.out.println("Employee age"+employeeage);
        System.out.println("Employee salary"+employeesalary);
        System.out.println("Employee premanentemp"+employeepremanentemp);
        sc.close();
    }
}