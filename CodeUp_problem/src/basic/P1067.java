package basic;
import java.util.*;
public class P1067 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("plus");
			if(n%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		else {
			System.out.println("minus");
			if(n%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		sc.close();
		
		return;
	}
}
