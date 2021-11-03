package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1027 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String time[]=br.readLine().split("\\.");
		System.out.print(String.format("%02d-%02d-%04d",Integer.parseInt(time[2]),Integer.parseInt(time[1]),Integer.parseInt(time[0])));
		return;
	}
}
