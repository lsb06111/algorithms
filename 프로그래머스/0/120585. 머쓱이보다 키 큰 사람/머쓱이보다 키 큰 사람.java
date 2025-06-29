
class Solution {
    public int solution(int[] array, int height) {
        int answer = array.length;
        for(int a : array)
            if(a <= height)
                answer--;
        return answer;
    }
}