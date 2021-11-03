package basic;
import java.util.*;
public class P1098 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int [][]map=new int[100][100];
		int h=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			int l=sc.nextInt();
			int d=sc.nextInt();
			int x=sc.nextInt();			 
			int y=sc.nextInt();
			if (d == 0) // row
			{
				for (int j = y; j < y+l; j++)
					map[x][j] = 1;
			}
			else {
				for (int j = x; j < x + l; j++)
					map[j][y] = 1;
			}
		}
		for (int i = 1; i <= h; i++)
		{
			for (int j = 1; j <= w; j++)
			{
				System.out.printf("%d ", map[i][j]);
			}
			System.out.printf("\n");
		}
		
		return;
	}
}
