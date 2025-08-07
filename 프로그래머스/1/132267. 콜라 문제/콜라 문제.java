class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = n;
        while(remain >= a){
            if(remain - a < 0)
                break;
            remain -= a;
            remain += b;
            answer += b;
        }
        return answer;
    }
}