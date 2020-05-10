import java.util.*;

public class GCD {
   private static long gcd_naive(long a, long b) {
	  if (a<b)
	  {
		  long temp=b;
		  b=a;
		  a=temp;
	  }
    while(b!=0)
    {
    	long temp = a%b;
    	a=b;
    	b= temp;
    	
    }
    return a;
  }
  

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(gcd_naive(a, b));
  }
}
