package basic;
import java.util.*;
public class P1097 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// TODO Auto-generated method stub
		    int [][]map=new int[20][20];
		    for (int i = 1; i <= 19; i++) 
		        for (int j = 1; j <= 19; j++)
		        	map[i][j]=sc.nextInt();

		    int n=sc.nextInt();
		    for (int i = 1; i <= n; i++){
		    	int x=sc.nextInt();
		    	int y=sc.nextInt();
		        for (int j = 1; j <= 19; j++)
		        {
		            if (map[x][j] == 1) map[x][j] = 0;
		            else map[x][j] = 1;
		        }
		        for (int j = 1; j <= 19; j++)
		        {
		            if (map[j][y] == 1) map[j][y] = 0;
		            else map[j][y] = 1;
		        }
		    }
		    for (int i = 1; i <= 19 ; i++)
		    {
		        for (int j = 1; j <= 19; j++)
		        {
		            System.out.printf("%d ", map[i][j]);
		        }
		        System.out.printf("\n");
		    }
		
		return;
	}
}
