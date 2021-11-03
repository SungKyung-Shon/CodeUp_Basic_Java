package basic;
import java.util.*;
public class P1086 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		long w=sc.nextLong();
		long h=sc.nextLong();
		long b=sc.nextLong();
		double k;
		k = w * h * b;
		System.out.printf("%.2f MB", k / 8 / 1024 / 1024);
		sc.close();
		return;
	}
}
