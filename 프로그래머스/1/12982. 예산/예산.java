import java.util.*;
class Solution {
    
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        int sum = 0;

        for (int money : d) {
            if (sum + money > budget) break;
            sum += money;
            count++;
        }

        return count;
    }
}