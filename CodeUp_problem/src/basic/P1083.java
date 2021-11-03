package basic;
import java.util.*;
public class P1083 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++)
		{
			if (i % 3 == 0 || i % 6 == 0 || i % 9 == 0)
				System.out.printf("X ");
			else
				System.out.printf("%d ", i);
		}
		
		return;
	}
}
