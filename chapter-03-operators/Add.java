import java.util.Scanner;

public class Add{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Number 1:");
        int a=sc.nextInt();
        System.out.print("Please Enter Number 2:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println( "This Is Add Program "+c);
    }
}