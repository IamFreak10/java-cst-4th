
import java.util.Scanner;

public  class QuadraticEquation{

    // ax2+bx+c=0
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double a,b,c,d,x1,x2;
        System.out.println("Enter a,b,c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        //d=b2-4ac
        d=b*b-4*a*c;
        if(a==0){
            System.out.println("Not a quadratic equation");
        }
        else if(d>0){
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Two different real roots:");
            System.out.printf("x1=%.2f \n",x1);
            System.out.printf("x2 =%.2f \n",x2);
        }
        else if(d==0){
            x1=-b/(2*a);
            System.out.println("Two Equal Roots: ");
            System.out.println("x= "+x1);
        }
        else{
            System.out.println("Complex roots");
        }
        
    }
}