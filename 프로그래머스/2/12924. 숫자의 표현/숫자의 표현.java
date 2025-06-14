import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int counting =0;
        
        int current =1;
        
        while(current <= n){
            
            int sum =0;
            for(int i=current; i<=n; i++){
                sum+= i;
                if(sum==n){
                    counting++;
                    break;
                }
                if(sum>n){
                    break;
                }
            }
            
            current++;
        }
        
        
        return counting;
    }
}