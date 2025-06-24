class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int evenCount = 0;
        int oddCount = 0;
        
        for(int num : num_list){
            if(num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
            
        answer = new int[]{evenCount, oddCount};
        return answer;
    }
}