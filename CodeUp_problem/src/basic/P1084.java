package basic;
import java.util.*;
public class P1084 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int k, c = 0;
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
	        for (int i = 0; i < r; i++)
	            for (int j = 0; j < g; j++)
	                for (k = 0; k < b; k++)
	                {
	                    System.out.printf("%d %d %d\n", i, j, k);
	                    c++;
	                }

	        System.out.printf("%d ", c);
		sc.close();
		return;
	}
}
