import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

       int input = 0;   //내가 입력할 값
       int answer = 0;  // 정답
       int count = 0;   // 몇번만에 정답을 맞췄는지 알려주는 계산기
       answer = (int)(Math.random()*100) + 1;
       Scanner scanner = new Scanner(System.in);

       do {
           System.out.println("1부터 100사이의 정수를 입력해주세요>");
           input = scanner.nextInt();
           if(input>answer){
               System.out.println("숫자가 높습니다! 더 낮은 숫자를 입력해주세요.");
           }
           else if (input<answer) {
               System.out.println("숫자가 낮습니다! 더 높은 숫자를 입력해주세요.");
           }
           count++;
       } while( input != answer);
        if (input == answer){
            System.out.printf("정답은 %d였습니다. 당신은 %d번만에 정답을 맞추었습니다.", input, count);
        }

       }



}