import java.util.*;
import static java.lang.Math.log10;
public class Main {
    public static void extraction2(int n){  // in serial fashion
        int c = (int)(log10(n)+1);
        int arr[] = new int[c];
        int i=0;
        int count2=0;
        while(n>0){
            arr[i]=n%10;
            i++;
            count2++;
        }
        for(int j=i;j>=0;j--){
            System.out.println(arr[j]);
        }
        System.out.println("The number of digits in n = "+count2);
    }
    public static void extraction(int n){   // in a reverse fashion
        int lastdigit;
        int count=0;
        while(n>0){
            lastdigit=n%10;
            System.out.println(lastdigit+" ");
            n=n/10;
            count++;
        }
        System.out.println("The number of digits in n = "+count);
    }
    public static void count(int n){
        int count3=(int)(log10(n)+1);
        System.out.println("The number of digits in n = "+count3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        extraction(n);
        //extraction2(n);
        //count(n);
    }
}