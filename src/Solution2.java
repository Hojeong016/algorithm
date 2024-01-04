public class Solution2 {
        public int solution2(int num1, int num2) {
            if (num1 < 0 && num1 > 100) {
                System.out.println("범위에 해당하지 않습니다.");
            } else if (num2 < 0 && num2 > 100) {
                System.out.println("범위에 해당하지 않습니다.");
            } else {
                int answer = num1 * num2;
                return answer;
            }
            return 0;
        }
    }

//&&을 사용해 보자

//if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
//         answer = num1 * num2;

//  if ((num1 < 0 || num1 >100) && (num2 < 0 || num2 > 100)) {
//        return -1;//      }