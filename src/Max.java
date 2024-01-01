import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        //3개의 정수 최대 값 구하기

        Scanner scanner = new Scanner(System.in);
        System.out.println("3개의 정수를 입력하세요");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int Max = max(a,b,c);
       // int max2 = Math.(a,b);
        System.out.println("입력한 정수 = "+ a+","+b+","+c+ " "+"최댓값 = "+ Max);

    }

    public static int max(int num1, int num2, int num3){

        int max = num1;
        if(num2>max) max = num2;
        if (num3>max) max = num3;
        //프로세스(여러 문장) 순자적으로 실행죄는 구조 : 순차 구조
        // IF 문처럼 ()의 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 구조: 선택 구조
        return max;
    }

}
