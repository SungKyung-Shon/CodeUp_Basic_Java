package basic;
import java.util.*;
public class P1081 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++)
				System.out.printf("%d %d\n", i, j);
		sc.close();
		return;
	}
}