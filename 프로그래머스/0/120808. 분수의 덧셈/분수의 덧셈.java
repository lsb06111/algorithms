class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int bottom = denom1 * denom2;
        int above = numer1 * denom2 + numer2 * denom1;
        int length = bottom > above ? bottom : above;
        
        for(int i=2; i <= length; i++){
            if(bottom % i == 0 && above % i == 0){
                bottom /= i;
                above /= i;
                i--;
            }
        }
        
        return new int[]{above, bottom};
    }
}