class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i < numbers.length; i++)
            for(int k=0; k < numbers.length; k++)
                if(i!=k && numbers[i]*numbers[k] > answer)
                    answer = numbers[i]*numbers[k];
        return answer;
    }
}