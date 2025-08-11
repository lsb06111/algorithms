import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int winCount = 0;
        int zeroCount = 0;
        int[] ranks = {6,6,5,4,3,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int l : win_nums)
            set.add(l);
        
        for(int num : lottos){
            if(num == 0)
                zeroCount++;
            else if(set.contains(num))
                winCount++;
        }
        System.out.println(winCount+", "+zeroCount);
        int minRank = ranks[winCount];
        int maxRank = ranks[winCount+zeroCount];
        return new int[]{maxRank, minRank};
    }
}