class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int cite = 0; cite <= citations.length; cite++){
            int count = 0;
            
            for(int c : citations){
                if(c >= cite)
                    count++;
            }
            if(count >= cite){
                if(answer < cite){
                    answer = cite;
                }
            }
                
            
        }
        return answer;
    }
}