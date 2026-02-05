
class Solution {
    public String solution(String phone_number) {
        int l = phone_number.length();
        int idx = l - 4;
        
        String number = phone_number.substring(idx);
        
        StringBuilder sb =  new StringBuilder();
        
        for(int i =0; i < idx; i++){
            sb.append("*");
        }
        
        sb.append(number);
        String answer = sb.toString();
        return answer;
    }
}

