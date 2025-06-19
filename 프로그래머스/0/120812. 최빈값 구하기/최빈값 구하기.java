import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : array){
            if(map.get(i) == null)
                map.put(i, 1);
            else
                map.put(i, map.get(i)+1);
        }
        int max = 0;
        boolean check = false;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                answer = key;
                max = map.get(key);
                check = false;
            }
            else if(map.get(key) == max){
                check = true;
            }
        }
        return check ? -1 : answer;
    }
}