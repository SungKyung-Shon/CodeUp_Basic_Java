package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1042 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String number[]=br.readLine().split(" ");
		long a=Long.parseLong(number[0]);
		long b=Long.parseLong(number[1]);
		System.out.print(a/b);
		br.close();
		
		return;
	}
}
