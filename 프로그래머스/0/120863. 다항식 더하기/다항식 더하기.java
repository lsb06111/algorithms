import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xCount = 0;
        int num = 0;
        String[] sp = polynomial.split(" ");
        for(String s : sp){
            char last = s.charAt(s.length()-1);
            if(last == 'x'){
                if(s.length() == 1)
                    xCount++;
                else
                    xCount += Integer.parseInt(s.substring(0,s.length()-1));
            }else if(last != '+')
                num += Integer.parseInt(s);
        }
        
        String x = "";
        String a = "";
        if(xCount > 1)
            x = xCount+"x";
        else if(xCount == 1){
            x = "x";
        }
        
        if(num != 0){
            a = " + "+num;
            if(x.isEmpty())
                a = num+"";
        }
        
        answer = x + a;
        return answer;
    }
}