package basic;
import java.util.*;
public class P1019 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=sc.next().split("\\.");
		int yyyy=Integer.parseInt(str[0]);
		int mm=Integer.parseInt(str[1]);
		int dd=Integer.parseInt(str[2]);
		
		System.out.printf(String.format("%04d.%02d.%02d", yyyy, mm, dd));
		sc.close();
		return;
	}
}
