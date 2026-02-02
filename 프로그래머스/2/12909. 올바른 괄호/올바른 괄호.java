import java.util.*;

class Solution {
    boolean solution(String s) {
        //String[] st = s.split("");
        boolean answer = true;
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        stack.offer(s.charAt(0));
        
        for(int i = 1; i < s.length() ; i++){
            char now = s.charAt(i);
            
            if(stack.isEmpty()){
                stack.offer(now);
            }else {
                char top  = stack.peek();
                
                if(top == '(' && now == ')'){
                    stack.poll();
                }else {
                   stack.offer(now);
                } 
            }
        }
        
        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}


//괄호가 바르게 짝지어 짐 -? () 무조건 열리고 닫힌것 
// 올바르면 -> true
// 올바르지 않으면 false
//스택 
// (
//)
//pop pop

// ")()("
//push )
//push (
// push )
// pop pop
//)
// push (
// 입력 다 했는데 남아있음 false
// m

