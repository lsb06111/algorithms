import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start = num%2==0 ? total/num - num/2+1 : total/num - num/2 ;
        for(int i=0; i < num; i++)
            answer[i] = start++;
        
//         for(int i=1000; i >= -100; i--){
//             int sum = 0;
            
//             for(int k=0; k < num; k++){
//                 sum += (i-k);
//                 answer[k] = (i-k);
//             }
//             if(sum == total){
//                 break;
//             }
//         }
        // Arrays.sort(answer);
        return answer;
    }
}