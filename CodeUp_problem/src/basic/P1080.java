package basic;
import java.util.*;
public class P1080 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		int n=sc.nextInt();
		for (i = 1; i < n; i++)
		{
			sum += i;
			if (sum >= n)
				break;
		}
		System.out.println(i);
		sc.close();
		return;
	}
}
