public class Solution {
    //두 수의 차 구하기
    public static  int solution(int num1, int num2) {
        if(-50000 > num1 || 50000 < num1){
            System.out.println("범위에 해당하지 않습니다.");
        } else if (-50000 > num2 || 50000 < num2) {
            System.out.println("범위에 해당하지 않습니다.");
        }else {
            int answer = num1 - num2;
            return answer;
        }
        return 0;
    }

}
//&& (논리 AND)나 || (논리 OR) 논리 연산자 사용하여 풀이


