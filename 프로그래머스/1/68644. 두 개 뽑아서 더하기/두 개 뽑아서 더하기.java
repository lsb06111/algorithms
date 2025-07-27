import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int k=0; k<numbers.length; k++){
                if(i != k)
                    set.add(numbers[i]+numbers[k]);
            }
        }
        answer = new int[set.size()];
        int i = 0;
        for(int s : set)
            answer[i++] = s;
        
        Arrays.sort(answer);
            
        return answer;
    }
}