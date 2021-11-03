package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1082 {
	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine(),16);
		for (int i = 1; i <= 15; i++)
		{
			System.out.format("%X*%X=%X\n", n, i,n * i);
		}
	
		return;
	}
}
