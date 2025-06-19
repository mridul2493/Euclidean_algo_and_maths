import java.util.*;
public class BinaryPalindrome {
        public static boolean IsBinaryPalindrome(int x){
            int reversed = 0;
            int original = x;
            while(x>0){
                reversed <<= 1;
                reversed |= (x&1);
                x >>= 1;
            }
            return reversed==original;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if(IsBinaryPalindrome(x)){
                System.out.println(x+" is a binary palindrome");
            }
            else{
                System.out.println(x+" is not a binary palindrome");
            }
        }
}