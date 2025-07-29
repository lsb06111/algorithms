import java.util.*;
class Solution {
    public int solution(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        String result = "";
        String tmp = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                if(map.get(tmp) != null){
                    result += map.get(tmp);
                    tmp = "";
                }
                result += c;
            }
            tmp += c;
            String tmp2 = "";
            for(int k=0; k<tmp.length(); k++){
                char ch = tmp.charAt(k);
                if(ch < '0' || ch > '9'){
                    tmp2 += ch;
                }
            }
            tmp = tmp2;
            if(tmp.length() != 0 && map.get(tmp) != null){
                result += map.get(tmp);
                tmp = "";
            }
            
        }
        
        return Integer.parseInt(result);
    }
}