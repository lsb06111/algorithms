class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'y' || c == 'Y')
                yCount++;
            else if(c == 'p' || c == 'P')
                pCount++;
        }

        return yCount==pCount;
    }
}