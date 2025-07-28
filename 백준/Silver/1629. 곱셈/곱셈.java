import java.util.*;
public class Main{
    public static long modPow(long base, long exp, long mod) {
	    long result = 1;
	    base %= mod;
	    while (exp > 0) {
	        if ((exp & 1) == 1) result = (result * base) % mod;
	        base = (base * base) % mod;
	        exp >>= 1;
	    }
	    return result;
	}
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(modPow(a,b,c));
        sc.close();
    }
}