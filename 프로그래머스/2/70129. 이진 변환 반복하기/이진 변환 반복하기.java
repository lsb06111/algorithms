class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int number =0;
        int counting =0;
        String st = s;
        
        while(!st.equals("1")){
            String tmp ="";
            for(int i=0; i<st.length(); i++){
                char current = st.charAt(i);
                if(current != '0'){
                    tmp+=current;
                }else
                    number++;
            }
            
            st = Integer.toBinaryString(tmp.length());
            counting++;
        }
        
        
        answer[0] = counting;
        answer[1] = number;
        
        return answer;
    }
}