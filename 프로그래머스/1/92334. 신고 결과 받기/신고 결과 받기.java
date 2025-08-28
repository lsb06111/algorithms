import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> counting = new HashMap<>();
        for(String r : report){
            String[] rs = r.split(" ");
            String id = rs[0];
            String pid = rs[1];
            HashSet<String> set;
            if(map.get(id) == null){
                set = new HashSet<>();
            }else{
                set = map.get(id);
            }
            if(set.add(pid)){
                if(counting.get(pid) == null){
                    counting.put(pid, 1);
                }else
                    counting.put(pid, counting.get(pid)+1);
            }
            map.put(id, set);
        }
        for(int i=0; i<answer.length; i++){
            HashSet<String> lists = map.get(id_list[i]);
            int count = 0;
            if(lists != null){
                for(String l : lists){
                    if(counting.get(l) >= k)
                        count++;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}