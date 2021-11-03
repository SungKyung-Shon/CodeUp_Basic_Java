package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1071 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr[]=br.readLine().split(" ");
		
		for(String s:arr) {
			if(s.equals("0")) {
				break;
			}
			else {
			System.out.println(s);
			}
		}
		br.close();
		return;
	}
}
