
import java.util.Scanner;

public  class  AreaOfCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Radius of Circle :");
        int radius=sc.nextInt();
        double area=Math.PI*radius*radius;
        System.out.printf("The Area of Circle is %.2f \n:",area);
    }
}