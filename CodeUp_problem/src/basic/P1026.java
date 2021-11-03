package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1026 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String time[]=br.readLine().split(":");
		System.out.print(Integer.parseInt(time[1]));
		br.close();
		return;
	}
}
