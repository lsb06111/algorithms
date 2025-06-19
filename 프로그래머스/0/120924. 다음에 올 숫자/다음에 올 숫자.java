class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int index = common.length;
        int last = common[index-(index/2)];
        int lastSecond = common[index-(index/2)-1];
        
        
        
        System.out.println("n, n-1: "+last+" "+lastSecond);
        
        if( (last != 0 && lastSecond != 0) && last == (lastSecond * (last/lastSecond)) ){
            
            answer = last * (int)Math.pow((last/lastSecond), index/2) ;
            System.out.println("공비+index/2: "+index/2);
        }
            
        else
            answer = last + (last-lastSecond) * (index/2) ;
        
        return answer;
    }
}