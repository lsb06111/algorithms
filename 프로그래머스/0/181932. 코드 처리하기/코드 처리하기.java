class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        
        for(int i=0; i<code.length(); i++){
            char c = code.charAt(i);
            
            if(!mode){
                if(c != '1')
                    ret += i % 2 == 0 ? c : "";
                else{
                    mode = true;
                    continue;
                }
            }else{
                if(c != '1')
                    ret += i % 2 == 1 ? c : "";
                else{
                    mode = false;
                }
            }
        }
        
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}