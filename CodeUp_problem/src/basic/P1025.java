package basic;
import java.util.*;
public class P1025 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split("");
		for(int i=str.length-1;i>=0;i--)
			System.out.printf("[%d]\n",Integer.parseInt(str[str.length-i-1])*((int)Math.pow(10,i)));
					
		sc.close();
		return;
	}
}
