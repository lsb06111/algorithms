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
			System.out.println("---- checking word: "+s+" ----");
			while(check) {
				System.out.println("word: "+word);
				boolean flag = false;
				if(set.contains(word)) {
					word = "";
					System.out.println("got: "+s);
					break;
				}
				for(int i=1; i < word.length(); i++) {
					String sub = word.substring(0,i);
					if(set.contains(sub)) {
						System.out.println("front: set contains "+sub);
						flag = true;
						word = word.substring(i,word.length());
						break;
					}
				}
				if(!flag) {
					for(int i=word.length()-2; i >=0; i--) {
						String sub = word.substring(i,word.length());
						if(set.contains(sub)) {
							System.out.println("back: set contains "+sub);
							flag = true;
							word = word.substring(0,i);
							break;
						}
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