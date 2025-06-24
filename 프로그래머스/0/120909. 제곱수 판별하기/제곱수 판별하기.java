class Solution {
    public int solution(int n) {
        String str = Math.sqrt(n)+"";
        
        return str.charAt(str.length()-2) == '.' ? 1 : 2;
    }
}