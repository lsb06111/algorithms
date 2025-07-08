class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int ele : array)
            if(ele == n)
                answer++;
        return answer;
    }
}