package basic;
import java.util.*;
public class P1064 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.print((a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c));
		return;
	}
}
