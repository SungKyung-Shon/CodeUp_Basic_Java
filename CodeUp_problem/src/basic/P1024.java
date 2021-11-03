package basic;
import java.util.*;
public class P1024 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split("");
		
		for(int i=0;i<str.length;i++)
			System.out.println("\'"+str[i]+"\'");
		sc.close();
		return;
	}
}
