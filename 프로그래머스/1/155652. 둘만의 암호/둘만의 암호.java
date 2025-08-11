import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int start = (int)c;
            ArrayList<Character> arr = new ArrayList<>();
            while(arr.size() < index){
                start = (start - 97 + 1) % 26 + 97;
                String target = (char)start + "";
                if(!skip.contains(target)){
                    arr.add((char)start);
                }
            }
            answer += arr.get(arr.size()-1);
        }
        return answer;
    }
}