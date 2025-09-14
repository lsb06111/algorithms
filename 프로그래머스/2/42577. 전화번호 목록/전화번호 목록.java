import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));
        
        for(String s : phone_book){
            String number = "";
            for(int i=0; i<s.length();i++){
                number+=s.charAt(i);
                if(set.contains(number) && number.length()!=s.length())
                    return false;
            }
        }
        return answer;
    }
}