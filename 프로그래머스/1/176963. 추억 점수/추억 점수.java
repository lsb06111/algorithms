import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<yearning.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(String p : photo[i]){
                if(map.get(p) != null)
                    sum += map.get(p);
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}