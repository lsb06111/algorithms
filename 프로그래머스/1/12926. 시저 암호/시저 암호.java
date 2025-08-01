class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] lowers = new char[26];
        char[] uppers = new char[26];
        char a = 'a';
        char A = 'A';
        for(int i=0; i < lowers.length; i++){
            lowers[i] = (char)a++;
            uppers[i] = (char)A++;
        }
        int index = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c != ' '){
                if(Character.isUpperCase(c)){
                    index = c - 'A';
                    int target = index + n;
                    if(target >= uppers.length)
                        target -= uppers.length;
                    answer += uppers[target];
                }else{
                   index = c - 'a';
                    int target = index + n;
                    if(target >= lowers.length)
                        target -= lowers.length;
                    answer += lowers[target];
                }
            }else
                answer+=' ';
        }
        return answer;
    }
}