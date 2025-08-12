class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        String tmp = "";
        for(int i=0; i<answer.length(); i++){
            char c = answer.charAt(i);
            if( (c >= 'a' && c <= 'z') || (c == '-') || (c == '_') ||
              (c >= '0' && c <= '9') || (c == '.') )
                tmp += c;
        }
        answer = tmp;
        tmp = "";
        for(int i=0; i<answer.length(); i++){
            char c = answer.charAt(i);
            if(c != '.' || (!tmp.isEmpty() && tmp.charAt(tmp.length()-1) != '.'))
                tmp += c;
        }
        answer = tmp;
        tmp = "";
        if(!answer.isEmpty()){
            if(answer.charAt(answer.length()-1) == '.')
                answer = answer.substring(0, answer.length()-1);
            if(answer.charAt(0) == '.')
                answer = answer.substring(1, answer.length());
        }else
            answer = "a";
        
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            if(answer.charAt(answer.length()-1) == '.')
                answer = answer.substring(0, answer.length()-1);
        }
        if(answer.length() <= 2){
            while(answer.length() < 3)
                answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}