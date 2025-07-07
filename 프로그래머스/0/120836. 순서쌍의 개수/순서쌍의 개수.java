import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n; 
        int sqrt = (int) Math.sqrt(num); 
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= sqrt; i++){
           if(num % i == 0){
            arr.add(i);
                if(num / i != i){
                    arr.add(num / i);
                }
            }
        }
        
        return arr.size();
    }
}