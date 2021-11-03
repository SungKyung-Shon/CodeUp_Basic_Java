package basic;
import java.util.*;
public class P1085 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		long h=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long s=sc.nextLong();
		double k;
		k = h * b * s * c;
		System.out.printf("%.1f MB", k / 8 / 1024 / 1024);
		sc.close();
		return;
	}
}
