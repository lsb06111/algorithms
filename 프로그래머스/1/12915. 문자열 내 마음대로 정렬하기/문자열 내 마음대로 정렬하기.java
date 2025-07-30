import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<Character, ArrayList<String>> map = new HashMap<>();
        for(String s : strings){
            char nth = s.charAt(n);
            if(map.get(nth) != null){
                ArrayList<String> a = map.get(nth);
                a.add(s);
                Collections.sort(a);
                map.put(nth, a);
            }else{
                ArrayList<String> a = new ArrayList<>();
                a.add(s);
                map.put(nth, a);
            }    
        }
        int index = 0;
        for(int i='a'; i<='z'; i++){
            if(map.get((char)i) != null){
                ArrayList<String> a = map.get((char)i);
                for(String s : a){
                    answer[index++] = s;
                }
            }
        }
        return answer;
    }
}