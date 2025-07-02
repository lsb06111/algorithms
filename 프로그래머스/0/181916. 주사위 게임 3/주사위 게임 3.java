import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] numbers = new int[]{a,b,c,d};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : numbers){
            if(map.get(n) == null)
                map.put(n,1);
            else
                map.put(n,map.get(n)+1);
        }
        int p = 0;
        int q = 0;
        int r = 0;
        int min = 7;
        switch(map.size()){
            case 1:
                for(int key : map.keySet())
                    answer = key * 1111;
                break;
            case 2:
                for(int key : map.keySet()){
                    if(map.get(key) == 1)
                        q = key;
                    else
                        p = key;
                }
                if(q == 0){
                    for(int key : map.keySet())
                        q = key != p ? key : q;
                    answer = (p+q) * Math.abs(p-q);
                    break;
                }
                answer = (int)Math.pow((10*p+q),2);
                break;
            case 3:
                for(int key : map.keySet()){
                    if(map.get(key) == 2)
                        p = key;
                    else{
                        if(q == 0)
                            q = key;
                        else
                            r = key;
                    }
                }
                answer = q * r;
                break;
            case 4:
                for(int key : map.keySet()){
                    if(key < min)
                        min = key;
                }
                answer = min;
                
                 
         }
        return answer;
    }
}