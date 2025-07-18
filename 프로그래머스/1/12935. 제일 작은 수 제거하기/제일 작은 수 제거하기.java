import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int min = sorted[0];
        
        int i = 0;
        for(int n : arr){
            if(n != min){
                answer[i] = n;
                i++;
            }
        }
        return i == 0 ? new int[]{-1} : answer;
    }
}