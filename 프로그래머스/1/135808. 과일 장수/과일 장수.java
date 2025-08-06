import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int count = 0;
        for(int i = score.length-1; i >= 0; i-=m){
            int min = 9999;
            for(int j=i; j>=i-m+1; j--){
                if(j >=0 ){
                    count++;
                    if(score[j] < min)
                        min = score[j];
                }
            }
            if(count == m)
                answer += min * m;
            count=0;
            
                System.out.println();
            
        }
        return answer;
    }
}