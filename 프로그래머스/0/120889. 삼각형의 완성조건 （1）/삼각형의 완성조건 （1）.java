class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int index = 0;
        for(int i=0; i < sides.length; i++)
            if(sides[i] > max){
                max = sides[i];
                index = i;
            }
        
        int rest = 0;
        for(int i=0; i < sides.length; i++){
            if(i != index){
                rest += sides[i];
            }
        }
        
        return rest > max ? 1 : 2;
    }
}