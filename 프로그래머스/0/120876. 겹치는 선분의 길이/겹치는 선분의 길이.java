import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] map = new int[201];
        for(int[] line : lines){
            int x = line[0];
            int y = line[1];
            for(int i=x; i<y; i++)
                map[i+100]+=1;
        }
        
        for(int m : map){
            if(m > 1)
                answer++;
        }
        return answer;
    }
}