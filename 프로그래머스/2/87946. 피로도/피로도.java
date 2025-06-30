import java.util.*;
class Solution {
    HashSet<String> set;
    boolean[] visited;
    public void dfs(int length, String sequence, int depth){
        if(depth == length){
            set.add(sequence);
            return;
        }
            
        for(int i=0; i < length; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(length, sequence+i, depth+1);
                visited[i] = false;
            }
        }
        
    }
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
		set = new HashSet<>();
		visited = new boolean[dungeons.length];
		dfs(dungeons.length, "", 0);
		int max = 0;
		int current = k;
		for (String s : set) {
			
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				int index = Integer.parseInt(s.charAt(i)+"");
				if (current >= dungeons[index][0]) {
					if (current - dungeons[index][1] >= 0) {
						sum++;
						current -= dungeons[index][1];
					}
				}
			}
			current = k;
			if (sum > max)
				max = sum;
		}
		return max;
        }
        
    }
