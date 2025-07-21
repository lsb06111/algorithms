class Solution {
    public long solution(long n) {
        long answer = 0;
        return n == (long)Math.pow((long)Math.sqrt((double)n), 2) ? (long)Math.pow((long)Math.sqrt((double)n)+1, 2) : -1;
    }
}