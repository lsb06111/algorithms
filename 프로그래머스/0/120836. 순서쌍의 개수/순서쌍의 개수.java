import java.util.*;
class Solution {
    public int gcd(int a, int b) {
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    
   
    public int solution(int n) {
        int answer = 0;
        int num = n; // 입력 값
        int sqrt = (int) Math.sqrt(num); // 100의 제곱근은 10
        ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList

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