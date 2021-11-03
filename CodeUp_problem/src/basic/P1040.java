package basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1040 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String number=br.readLine();
		long result=Long.parseLong(number);
		System.out.print(-1*result);
		br.close();		
		return;
	}
}
