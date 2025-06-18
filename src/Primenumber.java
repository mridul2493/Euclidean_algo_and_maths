import java.util.*;
public class Primenumber {
    public static void prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("It is not a prime number.");
                break;
            } else if (n==1) {
                System.out.println("Its not a prime number.");
                break;
            } else{
                if(i==n-1){
                    System.out.println("Its a prime number.");
                }
                else {
                    continue;
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        prime(n);
    }
}