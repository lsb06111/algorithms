import java.util.*;
class Solution {
    
    public boolean verification(String s){
        HashSet<Character> set = new HashSet<>();
        set.add('(');
        set.add('{');
        set.add('[');
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c))
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                
                if(stack.peek() == '(' && c == ')' ||
                   stack.peek() == '{' && c == '}' ||
                   stack.peek() == '[' && c == ']' )
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
    
    public String rotate(String s){
        return s.substring(1,s.length()) + s.charAt(0);
    }
    
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i < s.length(); i++){
            if(verification(s))
                answer++;
            s = rotate(s);
        }
        return answer;
    }
}