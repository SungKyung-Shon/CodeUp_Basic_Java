package basic;
import java.util.*;

public class P1095 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[10000];
		int min=24;
		for (int i = 0; i < n; i++)
		{
			arr[i]=sc.nextInt();
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println(min);
		
		return;
	}
}
