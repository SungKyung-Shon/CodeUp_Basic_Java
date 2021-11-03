package basic;
import java.util.*;
public class P1093 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] arr=new int[24];
		for (int i = 0; i < n; i++)
		{
			int t=sc.nextInt();
			arr[t] += 1;
		}
		for (int i = 1; i < 24; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
		return;
	}
}
