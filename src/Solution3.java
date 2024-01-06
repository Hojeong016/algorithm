
/** 문제 설명
 직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.
 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때,
 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.

 <제한사항>
 1 ≤ a < c ≤ 100
 **/

import java.util.Scanner;
public class Solution3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int c = sc.nextInt();

            int b_square = (int)Math.pow(c,2)- (int)Math.pow(a,2);

            System.out.println(b_square);
        }
    }


/* (int) : 강제 형변환(캐스팅)
   - 다른 숫자 데이터 타입을 int로 강제 변환할 때 사용
   - 데이터를 손실 발생될 수 있음.
   제곱근
   Math.pow(밑, 지수);
   - 실수형인 double
   - 정수형의 값을 구하려면 형변환 필요
 */

//다른 사람 풀이
/*public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c - a) * (c + a);

        System.out.println(b_square);
    }*/
