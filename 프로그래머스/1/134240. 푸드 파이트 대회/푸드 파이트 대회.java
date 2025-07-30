class Solution {
    public String solution(int[] food) {
        String answer = "0";
        for(int i=food.length-1; i >= 1; i--){
            int f = food[i]/2;
            answer += (i+"").repeat(f);
            answer = (i+"").repeat(f) + answer;
        }
        return answer;
    }
}