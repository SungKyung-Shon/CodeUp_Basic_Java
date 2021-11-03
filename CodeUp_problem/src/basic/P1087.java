package basic;
import java.util.*;
public class P1087 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int s=0;
		for (int i = 1; ; i++)
		{
			s += i;
			if (s >= n)
				break;
		}
		System.out.print(s);
		sc.close();
		return;
	}
}
