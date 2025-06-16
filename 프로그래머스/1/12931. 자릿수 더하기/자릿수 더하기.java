import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String text = n+"";
        
        for(int i=0; i<text.length(); i++){
            answer += Integer.parseInt(text.charAt(i)+"");
        }

        return answer;
    }
}