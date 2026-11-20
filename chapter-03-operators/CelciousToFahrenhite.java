
import java.util.Scanner;

public class CelciousToFahrenhite{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Celcious Value :");
        int celcious=sc.nextInt();
        int fahrenhite=(celcious*9/5)+32;
        System.out.println("The Fahrenhite Value is :"+fahrenhite);
    }
}