package basic;
import java.util.*;
public class P1091 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		long a=sc.nextLong();
		long m=sc.nextLong();
		long d=sc.nextLong();
		long n=sc.nextLong();
		for (int i = 1; i <n; i++)
		{
			a *= m;
			a+= d;
		}
		System.out.println(a);
		
		return;
	}
}
