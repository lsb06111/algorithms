import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int toIndex = 0;
        int max = 0;
        String ss = s;
        boolean found = true;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(found){
            found = false;
            char first = '1';
            int firstCount = 0;
            int otherCount = 0;
            
            for(int i=0; i<ss.length(); i++){
                char c = ss.charAt(i);
                if(first == '1'){
                    first = c;
                }
                if(c == first)
                    firstCount++;
                else{
                    otherCount++;
                }
                if(firstCount == otherCount){
                    found = true;
                    answer++;
                    ss = ss.substring(i+1, ss.length());
                    //System.out.println(ss);
                    break;
                }
            }
            if(!found && firstCount > 0 && otherCount >= 0){
                answer++;
            }
                
        }
        
        return answer;
    }
}