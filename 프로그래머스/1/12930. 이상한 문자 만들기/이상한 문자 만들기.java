class Solution {
    public  String solution(String s) {
        String word = "";
        int index = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += (index++ % 2 == 0 ? (c+"").toUpperCase() : (c+"").toLowerCase());
            }else{
                index = 0;
                word+=c;
            }
        }
        return word;
    }
}