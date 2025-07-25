import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
		
		 try{
			BufferedReader br
			          = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw
			          = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			HashMap<Integer, Integer> map = new HashMap<>();
			
			String[] data = br.readLine().split(" ");
			int number;
			for(String d : data) {
				number = Integer.parseInt(d);
				if(map.get(number) == null)
					map.put(number, 1);
				else
					map.put(number, map.get(number)+1);
			}
			
			int m = Integer.parseInt(br.readLine());
			int result;
			data = br.readLine().split(" ");
			for(String d : data) {
				number = Integer.parseInt(d);
				result = map.get(number) == null ? 0 : map.get(number);
				bw.write(result + " ");
			}
			bw.flush();
			bw.close();
			
		 }catch(Exception e){
	      }
		 
		 
		 
	}
    
}