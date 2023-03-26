import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

       int x, y, z;
       int absx, absy, absz;
       char signx, signy, signz;

       x = 10;
       y = -5;
       z = 0;

       absx = x >= 0 ? x : -x;
       absy = y >= 0 ? y : -y;
       absz = z >= 0 ? z : -z;  // x, y, z에 절대치를 붙혀준다.

       signx = x > 0 ? '+' : ( x==0 ?  ' ' : '-');
       signy = y > 0 ? '+' : ( y==0 ?  ' ' : '-');
       signz = z > 0 ? '+' : ( z==0 ?  ' ' : '-');  // 양수이면 + 음수이면 - 부호를 붙인다. 0이면 공백을 추가한다.

        System.out.printf("x = %c%d%n", signx, absx);
        System.out.printf("y = %c%d%n", signy, absy);
        System.out.printf("z = %c%d%n", signz, absz); // 처음 입력한 x, y, z를 출력한다.

        System.out.println();

    }
}