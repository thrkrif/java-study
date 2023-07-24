import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

      // 반복문, break문을 이용한다. sum의 총합이 100 이상일때 i의 값과 sum의 값을 출력하는 알고리즘
        int sum = 0;
        int i = 0;

        while(true){
            if(sum>100)
                break;
            ++i;
            sum += i;

        }
        System.out.println("i의 값은" + i);
        System.out.println("sum의 값은" + sum);

       }



}