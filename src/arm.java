import java.util.*;
import static java.lang.Math.log10;

public class arm {
    public static void armstrong(int n){
        int count = (int)(log10(n)+1);
        int trap=n;
        int lastdigit;
        int sum=0;
        while(n>0){
            lastdigit=n%10;
            n=n/10;
            sum= (int) (sum+(Math.pow(lastdigit,count)));
        }
        if(trap==sum){
            System.out.println("Its an armstrong number.");
        }
        else{
            System.out.println("Its not an armstrong number.");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrong(n);
    }
}