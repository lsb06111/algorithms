import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : numlist)
            if(num % n == 0)
                arr.add(num);
        int[] result = new int[arr.size()];
        int i = 0;
        for(int a : arr)
            result[i] = arr.get(i++);
        
        return result;
    }
}