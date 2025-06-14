class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] words = s.split(" ");
        
        boolean first= true;
        for(String word : words){
            
            String correct = "";
            if(word.length() ==0){
                answer+=" ";
                continue;
            }
            for(int i=0; i<word.length();i++){
                char ch = word.charAt(i);
                
                if( i==0){
                    if(ch >= 97 && ch <= 122){ //if uppercase
                        ch -= 32;
                    }
                }else{
                    if(ch >= 65 && ch <= 90){ //if uppercase
                        ch += 32;
                    }
                }
                correct+=ch;
            }
            
            if(first){
                answer+=correct;
                first=false;
            }else
                answer+=" "+correct;
        }
        
        if (s.substring(s.length() - 1, s.length()).equals(" ")) {
            return answer+" ";
        }
        
        return answer;
    }
}