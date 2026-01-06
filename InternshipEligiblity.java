import java.util.Scanner;
public class InternshipEligiblity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        System.out.println("Enter Gradution percentage");
        double percentage=sc.nextDouble();
        if(age>=18&& percentage<=60){
            System.out.println("\nEligible for Intership");
        }else{
            System.out.println("\nNot Eligible for Intership");
            if(age>18){
                System.out.println("Reason:Age must 18 or above");
            }
            if(percentage<60){
                System.out.println("Reason: Gradution persentage must be at least 60%");
            }
        }
        sc.close();
    }
}