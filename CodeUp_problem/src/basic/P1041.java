package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1041 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=br.readLine().charAt(0);
		n+=1;
		System.out.print((char)n);
		br.close();
		
		return;
	}
}
