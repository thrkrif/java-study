import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >= 90){
            grade = 'A';
            if(score >= 98){
                opt = '+';
            }
            else{
                opt = '-';
            }
        }


        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }
}