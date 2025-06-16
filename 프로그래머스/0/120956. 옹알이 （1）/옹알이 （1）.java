import java.util.*;
class Solution {
    public static int solution(String[] babbling) {
		int answer = 0;
		HashSet<String> set = new HashSet<>();
        set.add("aya");
        set.add("ye");
        set.add("woo");
        set.add("ma");
		for(String s : babbling) {
			if(set.contains(s)) {
				answer++;
				continue;
			}
			
			String word = s;
			boolean check = true;
			while(check) {
				boolean flag = false;
				if(set.contains(word)) {
					word = "";
					break;
				}
				for(int i=1; i < word.length(); i++) {
					String sub = word.substring(0,i);
					if(set.contains(sub)) {
						flag = true;
						word = word.substring(i,word.length());
						break;
					}
				}
				
				if(!flag || word.length() == 0)
					check = false;
			}
			if(word.length()==0)
				answer++;
			
		
		}
		return answer;
	}
    
    
}