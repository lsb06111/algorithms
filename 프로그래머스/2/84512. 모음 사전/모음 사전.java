import java.util.*;
class Solution {
    LinkedHashSet<String> set;
    public void dfs(char[] dict, String sub, int depth){
        if(depth == 5){
            return;
        }
        for(int i=0; i < 5; i++){
            set.add(sub+dict[i]);
            dfs(dict, sub+dict[i], depth+1);
        }
    }
    public int solution(String word) {
        int answer = 1;
        set = new LinkedHashSet<>();
        char[] dict = {'A', 'E', 'I', 'O', 'U'};
        dfs(dict, "", 0);
        for(String s : set){
            if(s.equals(word))
                return answer;
            else
                answer++;
        }
        return answer;
    }
}