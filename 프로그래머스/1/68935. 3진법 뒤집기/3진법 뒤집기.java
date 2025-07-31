import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = n;
        ArrayList<Integer> arr = new ArrayList<>();
        while(number > 0){
            arr.add(number % 3);
            number /= 3;
        }
        
        for(int i=0; i < arr.size(); i++){
            answer += (int)Math.pow(3,i) * arr.get(arr.size()-i-1);
        }
        return answer;
    }
}