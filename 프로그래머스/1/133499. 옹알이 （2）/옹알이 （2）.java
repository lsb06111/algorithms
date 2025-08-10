import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        
        set.add("aya");
        set.add("ye");
        set.add("woo");
        set.add("ma");
        for(String word : babbling){
            String s = "";
            int length = 0;
            ArrayList<String> arr = new ArrayList<>();
            for(int i=0; i<word.length(); i++){
                s += word.charAt(i);
                if(set.contains(s)){
                    length += s.length();
                    if(!arr.isEmpty() && arr.get(arr.size()-1).equals(s)){
                        length = -1;
                        break;
                    }
                    arr.add(s);
                    s = "";
                }
            }
            if(length == word.length()){
                answer++;
            }
        }
        return answer;
    }
}