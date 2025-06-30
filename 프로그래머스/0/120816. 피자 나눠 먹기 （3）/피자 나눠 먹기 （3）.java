class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        for(int i=slice; i <= 1000; i+=slice){
            if(i >= n)
                break;
            else
                answer++;
        }
        return answer;
    }
}