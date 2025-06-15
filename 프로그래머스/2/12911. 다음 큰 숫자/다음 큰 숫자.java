class Solution {
    
    public int checkOne(String binary){
        int lengthOne =0;
        
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) == '1')
                lengthOne++;
        }
        
        return lengthOne;
    }
    public int solution(int n) {
        int answer = n+1;
        
        String binary = Integer.toBinaryString(n);
        int lengthOne =checkOne(binary);
        
        
        while(true){
            
            if(checkOne(Integer.toBinaryString(answer)) == lengthOne){
                break;
            }
            
            answer++;
        }
        return answer;
    }
}