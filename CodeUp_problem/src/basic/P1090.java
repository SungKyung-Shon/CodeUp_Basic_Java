package basic;
import java.util.*;
public class P1090 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		long a=sc.nextLong();
		long r=sc.nextLong();
		long n=sc.nextLong();
		for (int i = 1; i <= n-1; i++)
		{
			a *= r;
		}
		System.out.println(a);
		
		return;
	}
}
