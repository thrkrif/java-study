import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {


    int[] elements = {20,30,50,10,40};
    int max, min = elements[0];
    for(int i = 1; i < elements.length; i++){
        if(min > elements[i])
            min = elements[i];

    }
        System.out.println(min
        );

      }


}


