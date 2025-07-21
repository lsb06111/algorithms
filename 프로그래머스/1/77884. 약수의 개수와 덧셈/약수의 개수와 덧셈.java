import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int k=1; k<=i; k++)
                if(i % k == 0)
                    set.add(k);
            if(set.size() % 2 == 0)
                answer += i;
            else
                answer -= i;
        }
        return answer;
    }
}