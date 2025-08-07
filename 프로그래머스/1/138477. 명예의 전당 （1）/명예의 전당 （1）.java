import java.util.*;
class Solution {
    
    public void update(ArrayList<Integer> ranking, int s, boolean isFull, int lastI){
        ranking.add(s);
        Collections.sort(ranking, Collections.reverseOrder());
        if(isFull)
            ranking.remove(lastI+1);
    }
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> ranking = new ArrayList<>();
        int index = 0;
        
        for(int s : score){
            int lastI = ranking.size()-1;
            if(ranking.size() < k){
                update(ranking, s, false, lastI);
            }else{
                if(ranking.get(lastI) < s){
                    update(ranking, s, true, lastI);
                }
            }
            answer[index++] = ranking.get(ranking.size()-1);
        }
        System.out.println(ranking);
        return answer;
    }
}