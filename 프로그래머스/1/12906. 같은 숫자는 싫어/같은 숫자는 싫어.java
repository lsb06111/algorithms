import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        int suc = -1;
        for(int a : arr){
            if(suc != a){
                arrayList.add(a);
                suc = a;
            }
               
        }
        int[] answer = new int[arrayList.size()];
        int index = 0;
        for(int a : arrayList)
            answer[index++] = a;
        return answer;
    }
}