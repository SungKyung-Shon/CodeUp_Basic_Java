package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1029 {
	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double d=Double.parseDouble(br.readLine());
		System.out.println(String.format("%.11f",d, args));
		
		br.close();
		
		return;
	}
}
