class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(!(c+"").equals(letter))
                answer+=c;
        }
        return answer;
    }
}