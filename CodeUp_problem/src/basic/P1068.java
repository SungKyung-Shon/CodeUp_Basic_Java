package basic;
import java.util.*;
public class P1068 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=90)
			System.out.println("A");
		else if(n>=70)
			System.out.println("B");
		else if(n>=40)
			System.out.println("C");
		else
			System.out.println("D");
		sc.close();
		
		return;
	}
}
