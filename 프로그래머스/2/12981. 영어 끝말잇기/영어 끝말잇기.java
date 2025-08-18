import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        HashSet<String>[] sets = new HashSet[n];
        for (int i = 0; i < sets.length; i++) {
                sets[i] = new HashSet<>();
        }
        int person = 0;
        int nthWord = 0;
        char prevC = '-';
        mainLoop:for(int i=0; i < words.length; i++){
            String word = words[i];
            System.out.println(prevC);
            if(prevC != '-' && prevC != word.charAt(0)){
                person = i % n + 1;
                nthWord = sets[i%n].size()+1;
                break mainLoop;
            }
            prevC = word.charAt(word.length()-1);
            System.out.println(sets[i%n]);
            for(HashSet<String> set : sets){
                if(set.contains(word)){
                    person = i % n + 1;
                    nthWord = sets[i%n].size()+1;
                    break mainLoop;
                }
            }
            sets[i%n].add(word);
            
        }

        return new int[]{person, nthWord};
    }
}