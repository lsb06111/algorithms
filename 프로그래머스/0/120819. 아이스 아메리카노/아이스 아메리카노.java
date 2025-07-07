class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = 0;
        for(int i=5500; i <= money; i+=5500){
            count++;
        }
        answer[0] = count;
        answer[1] = money - (5500 * count);
        return answer;
    }
}