class Solution {
    public int gcd(int n, int m){
        if (n % m == 0) {
            return m;
        }
        return gcd(m, n%m);
    }
    
    public int lcm(int n, int m){
        
        return n * m / gcd(n, m);

    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
}