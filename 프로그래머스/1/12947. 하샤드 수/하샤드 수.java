class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xs = x+"";
        int xn = 0;
        for(int i=0; i < xs.length(); i++){
            xn += Integer.parseInt(xs.charAt(i)+"");
        }
        return x % xn == 0;
    }
}