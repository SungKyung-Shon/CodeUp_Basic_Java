package basic;
import java.util.*;
public class P1023 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String number[]=sc.nextLine().split("\\.");
		
		System.out.printf(number[0]+"\n");
		System.out.printf(number[1]);
		sc.close();
		
		return;
	}
}
