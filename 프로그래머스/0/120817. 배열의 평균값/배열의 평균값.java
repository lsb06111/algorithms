class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int num : numbers)
            sum += num;
        answer = (double)sum / numbers.length;
        return answer;
    }
}