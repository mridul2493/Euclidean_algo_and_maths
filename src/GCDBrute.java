import java.util.*;
import static java.lang.Math.min;
public class GCDBrute {
    public static void GCD(int n1, int n2){
        int gcd=1;
        for(int i=1;i<=min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                continue;
            }
            else{
                continue;
            }
        }
        System.out.println("GCD = "+gcd);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        GCD(n1,n2);
    }
}