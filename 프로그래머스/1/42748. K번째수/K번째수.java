import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int nth = commands[i][2]-1;
            int[] tmp = new int[end-start+1];
            for(int k=start; k<=end; k++){
                tmp[k-start] = array[k];
            }
            Arrays.sort(tmp);
            answer[i] = tmp[nth];
        }
        return answer;
    }
}