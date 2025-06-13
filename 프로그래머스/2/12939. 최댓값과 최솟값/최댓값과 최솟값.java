class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strings = s.split(" ");
        int firstEle = Integer.parseInt(strings[0]);
        int max = firstEle;
        int min = firstEle;
        
        for(String str : strings){
            int current = Integer.parseInt(str);
            if(current > max)
                max = current;
            if(current < min)
                min = current;
        }
        answer = min+" "+max;
        return answer;
    }
}