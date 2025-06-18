import java.util.*;
public class reverse {
    public static int reversenumber(int n){
        int lastdigit;
        int revnum=0;
        while(n>0){
            lastdigit=n%10;
            n=n/10;
            revnum=(revnum*10)+lastdigit;
        }
        return revnum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        System.out.println("Reverse of "+n+" is "+reversenumber(n));
    }
}
