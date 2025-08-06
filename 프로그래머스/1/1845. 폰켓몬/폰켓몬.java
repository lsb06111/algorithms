import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.get(n) != null)
                map.put(n, map.get(n)+1);
            else
                map.put(n, 1);
        }
        return map.size() >= nums.length/2 ? nums.length/2 : map.size();
    }
}