import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] init = players;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            map.put(players[i],i);
        }
        
        for(String p : callings){
            int index = map.get(p);
            String tmp = init[index];
            map.put(players[index], index-1);
            map.put(players[index-1], index);
            init[index] = init[index-1];
            init[index-1] = tmp;
            
        }
        
        return init;
    }
}