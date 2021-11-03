package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1035 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n=br.readLine();
		int hex=Integer.parseInt(n,16);
		System.out.println(Integer.toOctalString(hex));
		br.close();
		
		return;
	}
}
