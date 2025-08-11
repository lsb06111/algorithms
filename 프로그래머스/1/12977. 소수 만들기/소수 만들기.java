class Solution {
    
    public boolean isPrime(int n) {
        if (n <= 1) 
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) 
                return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k= j+1; k<nums.length; k++){
                    int num = nums[i]+nums[k]+nums[j];
                    if(isPrime(num))
                        answer++;
                }
            }
        }
        return answer;
    }
}