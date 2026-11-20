
import java.util.Scanner;

public  class AreaofSqure{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Side of Squre :");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("The Area of Squre is :"+area);
    }
}