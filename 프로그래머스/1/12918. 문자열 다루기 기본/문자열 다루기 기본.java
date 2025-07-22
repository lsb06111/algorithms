class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6)
            return false;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            try{
                Integer.parseInt(c+"");
            }catch(Exception e){
                return false;
            }
        }
        
        return answer;
    }
}