package basic;
import java.util.*;
public class P1094 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for (int i = 0; i < n; i++){
			arr[i]=sc.nextInt();
		}
		for (int i =n-1; i >=0; i--){
			System.out.printf("%d ", arr[i]);
		}
		
		return;
	}
}
