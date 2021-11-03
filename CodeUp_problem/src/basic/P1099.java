package basic;
import java.util.*;
public class P1099 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int x = 2, y = 2;
		int [][]map=new int[12][12];
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				map[i][j]=sc.nextInt();
			}
		}

		while (true) {
			if (map[x][y] == 0) {
				map[x][y] = 9;
				y+=1;
			}
			if (map[x][y] == 1) {
				y-=1;
				x+=1;
			}
			if (map[x][y] == 2) {
				map[x][y] = 9;
				break;
			}
			else if (map[x][y+1] == 1 && map[x + 1][y] == 1) {
				if (map[x][y] == 0) {
					map[x][y] = 9;
				}
				break;			
			}
		}

		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <=10; j++)
			{
				System.out.printf("%d ", map[i][j]);
			}
			System.out.printf("\n");
		}
		
		return;
	}
}
