import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++){
            String num = i+"";
            boolean isNum = true;
            for(int k=0; k<num.length(); k++){
                char c = num.charAt(k);
                if(c != '5' && c != '0'){
                    isNum = false;
                    break;
                }
            }
            if(isNum)
                list.add(i);
        }
        
        if(list.size() == 0)
            return new int[]{-1};
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        return answer;
    }
}