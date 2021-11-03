package basic;
import java.util.*;
public class P1079 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while (true) {
			char c=sc.next().charAt(0);
			if (c != 'q') {
				System.out.println(c);
			}
			else {
				System.out.println("q");
				break;
			}
		}
		sc.close();
		return;
	}
}
