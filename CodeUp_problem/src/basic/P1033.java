package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1033 {
	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println(String.format("%X", n));
		br.close();
		
		return;
	}
}
