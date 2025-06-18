import java.util.*;
public class palindrome {
    public static void palindrome(int n){
        int lastdigit;
        int revnum=0;
        int trap=n;
        while(n>0){
            lastdigit=n%10;
            n=n/10;
            revnum=(revnum*10)+lastdigit;
        }
        if(revnum==trap){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        palindrome(n);
    }
}
