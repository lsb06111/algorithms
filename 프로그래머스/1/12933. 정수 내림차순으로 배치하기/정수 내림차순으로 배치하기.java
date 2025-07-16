import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] spl = (n+"").split("");
        Integer[] ints = new Integer[spl.length];
        for(int i=0; i < spl.length; i++){
            ints[i] = Integer.parseInt(spl[i]);
        }
        Arrays.sort(ints, Collections.reverseOrder());
        long unit = 1;
        for(int i=ints.length-1; i>=0; i--){
            answer += (ints[i] * unit);
            unit *= 10;
        }
        return answer;
    }
}