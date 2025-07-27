class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        int answerIndex = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = 0;
            boolean found = false;
            for(int k=i-1; k >=0; k--){
                index++;
                if(s.charAt(k) == c){
                    found = true;
                    break;
                }
            }
            answer[answerIndex++] = found ? index : -1;
        }
        
        return answer;
    }
}