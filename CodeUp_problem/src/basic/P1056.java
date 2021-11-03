package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1056 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n[]=br.readLine().split(" ");
		boolean a=Integer.parseInt(n[0])!=0;
		boolean b=Integer.parseInt(n[1])!=0;
		System.out.print((a&&!b)||(!a&&b)?1:0);
		br.close();
		return;
	}
}
