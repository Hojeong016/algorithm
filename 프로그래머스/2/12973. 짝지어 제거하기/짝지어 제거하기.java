import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char crr = s.charAt(i); 
            
            if(!stack.isEmpty()){
                char front = stack.peekLast(); 
               
                if(front == crr){
                    stack.pollLast();
                } else {
                    stack.offerLast(crr); 
                }
            } else {
                stack.offerLast(crr);
            }
        }

        
        if(!stack.isEmpty()){
            return 0;
        } else {
            return 1;
        }
        
        
    }
}

