import java.util.*;

class Failure implements Comparable<Failure>{
    public int stg;
    public double rate;
    
    public Failure(int stg, double rate){
        this.stg = stg;
        this.rate = rate;
    }

	@Override
    public int compareTo(Failure o) {
        if (this.rate == o.rate) {
            return this.stg - o.stg; 
        }
        return Double.compare(o.rate, this.rate); 
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<Failure> fails = new ArrayList<>();
        for(int i=1; i<=N; i++){
        	int denom = 0;
        	int count = 0;
            for(int s : stages) {
            	if(s >= i) { 
            		denom++;
            		if(s == i)
                		count++;
            	}
            }
            double v = denom == 0 ? 0 : (double)count/denom;
            fails.add(new Failure(i, v));
        }
        
        Collections.sort(fails);
        int i = 0;
        for(Failure f : fails) 
        	answer[i++] = f.stg;
        
        return answer;
    }
}