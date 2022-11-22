import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
       int i = 5, j = 0;

       j = i++;
        System.out.println("J = i++; 실행 후, i = " + i +", j = "+ j);

        i = 5;
        j = 0;


        j =  ++i;

        System.out.println("j=++i 실행 후, i=" + i +", j="+ j);
    }
}