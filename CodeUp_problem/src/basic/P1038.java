package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1038 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String number[]=br.readLine().split(" ");
		long result=Long.parseLong(number[0]+Long.parseLong(number[1]));
		System.out.print(result);
		br.close();

		
		return;
	}
}
